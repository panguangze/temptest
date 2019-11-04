package com.byoryn.rppadmin.service;

import com.byoryn.rppdb.dto.UserDto;
import com.byoryn.rppdb.entity.UserEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author panguangze
 * @data 2019/10/31
 */
public interface UserService {
    UserEntity getUserByName(String username);
    UserEntity register(UserDto userDto);
    /**
     * 登录接口，返回一个token
     */
    String login(String username, String password);
}
