package com.nf511.flower.controller;

import com.nf511.flower.common.R;
import com.nf511.flower.common.token.JwtUtils;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.entity.User;
import com.nf511.flower.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.client.RequestExpectation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import static com.nf511.flower.common.token.JavaWebToken.createToken;
import static com.nf511.flower.common.token.JwtUtils.encode;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 查询全部用户
     */
    @RequestMapping(path = "/selectAllUser")
    @ResponseBody
    public R selectAllUser(User user) {
        return R.ok(userService.selectAllUser(user));
    }

    /**
     * 查询全部用户数量
     */
    @RequestMapping(path = "/getUserCount")
    @ResponseBody
    public R getUserCount(User user) {
        return R.ok(userService.getUserCount(user));
    }

    /**
     * 根据手机号或邮箱查询
     */
    @RequestMapping("/selectByUserPhoneAndMailbox")
    @ResponseBody
    public R selectByUserPhoneAndMailbox(String userPhoneAndMailbox, Model model,
                                         HttpServletRequest request, HttpServletResponse response) {

        User user = new User();
        user.setUserPhone(userPhoneAndMailbox);
        user.setUserMailbox(userPhoneAndMailbox);
        String token = encode(user,10000);
        System.out.println("token:" + token);
        Cookie cookie=new Cookie("token",token);
        cookie.setMaxAge(36000);
        response.addCookie(cookie);

//        response.setHeader("Access-Control-Allow-Origin","http://localhost:8888");
        return R.ok(userService.selectByUserPhoneAndMailbox(userPhoneAndMailbox));
    }

    /**
     * 批量启用
     */
    @RequestMapping("/MoreUpdateUserStateIdStart")
    @ResponseBody
    public R MoreUpdateUserStateIdStart(@RequestBody List<Integer> userIds) {
        return R.ok(userService.MoreUpdateUserStateId(userIds, 9));
    }

    /**
     * 批量停用
     */
    @RequestMapping("/MoreUpdateUserStateIdStop")
    @ResponseBody
    public R MoreUpdateUserStateIdStop(@RequestBody List<Integer> userIds) {
        return R.ok(userService.MoreUpdateUserStateId(userIds, 10));
    }

    /**
     * 修改状态
     */
    @RequestMapping("/UpdateUserStateId")
    @ResponseBody
    public R UpdateUserStateId(int userId, int userStateId) {
        return R.ok(userService.UpdateUserStateId(userId, userStateId));
    }

    /**
     * 修改密码
     */
    @RequestMapping("/UpdateUserPassword")
    @ResponseBody
    public R UpdateUserPassword(int userId, String userPassword) {
        return R.ok(userService.UpdateUserPassword(userId, userPassword));
    }

    /**
     * 修改邮箱
     */
    @RequestMapping("/UpdateUserMailbox")
    @ResponseBody
    public R UpdateUserMailbox(int userId, String userMailbox) {
        return R.ok(userService.UpdateUserMailbox(userId, userMailbox));
    }

    /**
     * 添加
     */
    @RequestMapping(path = "/insertUser", method = RequestMethod.POST)
    @ResponseBody
    public R insertUser(User user) {
        return R.ok(userService.insertUser(user));
    }

    /**
     * 修改
     */
    @RequestMapping(path = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public R updateUser(User user) {
        return R.ok(userService.updateUser(user));
    }

    /**
     * 删除
     */
    @RequestMapping(path = "/deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public R deleteUser(int userId) {
        return R.ok(userService.deleteUser(userId));
    }

    /**
     * 多删除
     */
    @RequestMapping(path = "/deleteAll", method = RequestMethod.POST)
    @ResponseBody
    public R deleteAll(@RequestBody List<Integer> userIds) {
        return R.ok(userService.deleteAll(userIds));
    }
}