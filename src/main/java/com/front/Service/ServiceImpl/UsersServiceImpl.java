package com.front.Service.ServiceImpl;

import com.front.Service.UsersService;
import com.front.dao.UsersMapper;
import com.front.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yingmanji on 2017/9/27.
 */
@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersMapper usersMapper;

    public List<Users> queryAll() {

        List<Users> usersList=usersMapper.queryAll();
        return usersList;
    }



}
