package com.nf511.flower.controller;

import com.nf511.flower.common.R;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.entity.User;
import com.nf511.flower.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 根据手机号或邮箱查询
     * */
    @RequestMapping("/selectByUserPhoneAndMailbox")
    @ResponseBody
    public R selectByUserPhoneAndMailbox(String userPhoneAndMailbox){
        System.out.printf(userPhoneAndMailbox);
        return R.ok(userService.selectByUserPhoneAndMailbox(userPhoneAndMailbox));
    }


    /**
     * 查询全部用户
     * */
    @RequestMapping(path = "/selectAllUser",method = RequestMethod.POST)
    @ResponseBody
    public List<User> selectAllUser() {
        return userService.selectAllUser();
    }

    /**
     *  用户登陆
     * */
    @RequestMapping(path = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public User userLogin(String userName ,String userPassword){
        return userService.userLogin(userName,userPassword);
    }

    /**
     * 根据ID查询
     * */
    @RequestMapping(path = "/selectUserId",method = RequestMethod.POST)
    @ResponseBody
    public R selectUserId(int userId){
        return R.ok(userService.selectUserId(userId));
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/insertUser",method = RequestMethod.POST)
    @ResponseBody
    public R insertUser(User user){
        return R.ok(userService.insertUser(user));
    }

    /**
     * 修改
     * */
    @RequestMapping(path = "/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public R updateUser(User user){
        return R.ok(userService.updateUser(user));
    }

    /**
     * 删除
     * */
    @RequestMapping(path = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public R deleteUser(int userId){
        return R.ok(userService.deleteUser(userId));
    }

    /**
     * 多删除
     * */
    @RequestMapping(path = "/deleteAll",method = RequestMethod.POST)
    @ResponseBody
    public R deleteAll(@RequestBody List<Integer> items){
        return R.ok(userService.deleteAll(items));
    }
}
