package com.nf511.flower.service;


import com.nf511.flower.entity.User;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface UserService {

    List<User> selectAllUser(User user);

    int getUserCount(User user);

    User selectByUserPhoneAndMailbox(@Param("userPhoneAndMailbox") String userPhoneAndMailbox);

    int UpdateUserStateId(@Param("userId") long userId, @Param("userStateId") long userStateId);

    int MoreUpdateFlowerStateId(@Param("userIds") List<Integer> userIds,@Param("userStateId") long userStateId);

    int updateUser(User user);

    int insertUser(User user);

    int deleteUser(@Param("userId") int userId);

    int deleteAll(@Param("userIds") List<Integer> userIds);

}
