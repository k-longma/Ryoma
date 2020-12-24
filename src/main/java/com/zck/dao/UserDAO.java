package com.zck.dao;

import com.zck.domain.UserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zck
 * @date 2020/12/24 14:54
 * @ClassName UserDAO
 */
public interface UserDAO {

    //新增用户
    int addUser(UserDO user);

    //删除用户
    int deleteUser(@Param("userId") Integer id);

    //修改用户
    int updateUser(UserDO user);

    //查询一个用户
    UserDO selectById(@Param("userId") Integer id);

    //查询用户列表
    List<UserDO> selectAllUser();
}
