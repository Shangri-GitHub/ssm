package com.demo.controller;

import com.demo.dao.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wwwwei on 17/3/18.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("regist")
    public String createUser(UserEntity user, Model model){

        userService.createUser(user);

        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }


    @RequestMapping("login")
    public String login(String name,String password,Model model){

        System.out.println("用户登录："+name+password);

        /*Map<String, String> map=new LinkedHashMap<String,String>();

        map.put("name", user.getName());
        map.put("password", user.getPassword());*/

        List<UserEntity> userEntities = userService.login(name,password);


        for(UserEntity u : userEntities){
            System.out.println(u.getName());
            System.out.println(u.getPassword());
        }




        model.addAttribute("msg", "登录成功");
        return "success";
    }
}
