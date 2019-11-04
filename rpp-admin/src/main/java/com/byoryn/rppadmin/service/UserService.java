package com.byoryn.rppadmin.service;

import com.byoryn.rppdb.dto.UserDto;
import com.byoryn.rppdb.entity.UserEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author panguangze
 * @date 2019/10/31
 */
public interface UserService {
    UserEntity getUserByName(String username);
    UserEntity register(UserDto userDto);
    /**
     * 登录接口，返回一个token
     */
    String login(String username, String password);

    /**
     * 注册成功以后直接生成token并且登录
     * @return
     */
    String register();
}
