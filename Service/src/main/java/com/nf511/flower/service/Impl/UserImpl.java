package com.nf511.flower.service.Impl;


import com.nf511.flower.dao.UserDao;
import com.nf511.flower.entity.User;
import com.nf511.flower.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

@Service
public class UserImpl implements UserService {

    @Autowired
    UserDao userDao;


    public List<User> selectAllUser(User user) {
        return userDao.selectAllUser(user);
    }

    public int getUserCount(User user) {
        return userDao.getUserCount(user);
    }

    public User selectByUserPhoneAndMailbox(String userPhoneAndMailbox) {
        return userDao.selectByUserPhoneAndMailbox(userPhoneAndMailbox);
    }

    public int UpdateUserStateId(long userId, long userStateId) {
        return userDao.UpdateUserStateId(userId, userStateId);
    }

    public int MoreUpdateFlowerStateId(List<Integer> userIds, long userStateId) {
        return userDao.MoreUpdateFlowerStateId(userIds, userStateId);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int deleteUser(int userId) {
        return userDao.deleteUser(userId);
    }

    public int deleteAll(List<Integer> userIds) {
        return userDao.deleteAll(userIds);
    }
}
