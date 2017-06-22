package com.yzz.ct.controller;

import com.jfinal.core.Controller;
import com.yzz.ct.common.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yzz on 2017/6/22.
 */
public class UserController extends Controller {

    public void index() {
       renderText("我不不不不不不不是浪费大家酸辣粉");
    }


    public void register(){

       User user = new User();
       user.setId(null);
       user.setPassword("123");
       user.setName("呵呵哒");
       user.save();

    }

    public void userList(){

        List<User> userList = User.dao.find("select * FROM `user`");
        renderText(userList+"");

    }
}
