package com.byoryn.rppadmin.service.imp;

import com.byoryn.rppadmin.exception.CaptchaErrorException;
import com.byoryn.rppadmin.exception.UsernameNotValidException;
import com.byoryn.rppadmin.service.UserService;
import com.byoryn.rppcommom.utils.JwtTokenUtil;
import com.byoryn.rppdb.dto.UserDto;
import com.byoryn.rppdb.entity.UserEntity;
import com.byoryn.rppdb.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panguangze
 * @date 2019/11/4
 */
@Slf4j
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserEntity getUserByName(String username) {
        List<UserEntity> userEntities = userRepository.findByUsername(username);
        if(! userEntities.isEmpty()) {
            return userEntities.get(0);
        }
        return null;
    }

    @Override
    public String register(UserDto userDto) {
        //查看该用户名是否已经被注册
        checkUsername(userDto.getUsername());
        //校验注册时验证码是否正确
        checkCaptcha(userDto.getValidateCode());
        String encodePassword = passwordEncoder.encode(userDto.getPassword());
        UserEntity userEntity = new UserEntity(userDto.getUsername(), encodePassword, userDto.getPhoneNum(), userDto.getEmail());
        userRepository.save(userEntity);
        return JwtTokenUtil.generateToken(userDto.getUsername());
    }

    @Override
    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(! passwordEncoder.matches(password, userDetails.getPassword())) {
            throw new BadCredentialsException("密码错误");
        }
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,null);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return JwtTokenUtil.generateToken(userDetails);
    }

    /**
     * 检测用户名是否可用
     * @param username
     */
    @Override
    public void checkUsername(String username) {
        if(!userRepository.findByUsername(username).isEmpty()) {
            UsernameNotValidException e = new UsernameNotValidException();
            log.info("errorCode: "+e.errorCode()+"errorMessage: "+e.getMessage());
            throw e;
        }
    }

    /**
     * 校验注册邮箱验证码
     * @param captcha
     */
    private void checkCaptcha(String captcha) {
        if(! "11111".equals(captcha)) {
            CaptchaErrorException e = new CaptchaErrorException();
            log.info("errorCode: "+e.errorCode()+" errorMessage: "+e.getMessage());
        }
    }
}
