package com.byoryn.rppadmin.controller;

import com.byoryn.rppadmin.component.annotation.ControllerLog;
import com.byoryn.rppadmin.service.UserService;
import com.byoryn.rppadmin.service.CaptchaSender;
import com.byoryn.rppcommom.response.ResponseResult;
import com.byoryn.rppcommom.utils.WebServiceUtils;
import com.byoryn.rppdb.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author panguangze
 * @date 2019/11/4
 */
@Api(tags = "UserController", value = "后台用户管理")
@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private CaptchaSender captchaSender;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation("用户登录，返回token")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ControllerLog
    public ResponseResult login(String username, String password) {
        Map<String, String> tokenMap = new HashMap<>();
        String token = userService.login(username, password);
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return ResponseResult.ok(tokenMap);
    }

    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    @ControllerLog
    public ResponseResult register(@RequestBody UserDto userDto) {
        Map<String, String> tokenMap = new HashMap<>();
        String token = userService.register(userDto);
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return ResponseResult.ok(tokenMap);
    }

    @ApiOperation("检测用户名是否可用")
    @RequestMapping(value = "/register/checkusername", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult checkUsername(@RequestParam("username") String username) {
        userService.checkUsername(username);
        return ResponseResult.success();
    }

    @ApiOperation("获取注册验证码")
    @RequestMapping(value = "/register/captcha", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult checkCaptcha(@RequestParam String receiver) {
        String captcha = WebServiceUtils.generateCaptcha(6);
        captchaSender.sendCaptcha(receiver, captcha);
        return ResponseResult.success();
    }
}
