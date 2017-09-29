package com.front.web;

import com.front.Service.UsersService;
import com.front.dao.UsersMapper;
import com.front.entity.Users;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yingmanji on 2017/9/27.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    //todo 获取所有用户信息
    @ApiOperation(value = "获取所有用户信息",notes = "获取所有用户信息",httpMethod = "GET")
    @RequestMapping(method = RequestMethod.GET,value = "/getUserList")
    @ResponseBody
    public List<Users> getUserList(){
        return usersService.queryAll();
    }

}
