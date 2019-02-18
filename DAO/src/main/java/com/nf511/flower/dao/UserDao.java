package com.nf511.flower.dao;


import com.nf511.flower.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    User selectByUserPhoneAndMailbox(@Param("userPhoneAndMailbox") String userPhoneAndMailbox);
    int updateUser(User user);
    List<User> selectAllUser();
    User userLogin(@Param("userName") String userName, @Param("userPassword") String userPassword);
    User selectUserId(@Param("userId") int userId);
    List<User>selectAllUserByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertUser(User user);
    int deleteUser(@Param("userId") int userId);
    int deleteAll(@Param("userIds") List<Integer> items);
}
