package com.byoryn.rppadmin.service.imp;

import com.byoryn.rppadmin.service.UserService;
import com.byoryn.rppcommom.jwtToken.JwtTokenUtil;
import com.byoryn.rppdb.dto.UserDto;
import com.byoryn.rppdb.entity.UserEntity;
import com.byoryn.rppdb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panguangze
 * @data 2019/11/4
 */
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
    public UserEntity register(UserDto userDto) {
        return null;
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
}
