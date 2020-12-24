package com.zck.service;

import com.zck.domain.UserDO;

import java.util.List;

/**
 * @author zck
 * @date 2020/12/24 15:16
 * @ClassName UserService
 */
public interface UserService {

    //新增用户
    int addUser(UserDO user);

    //删除用户
    int deleteUser(Integer id);

    //修改用户
    int updateUser(UserDO user);

    //查询一个用户
    UserDO selectById(Integer id);

    //查询用户列表
    List<UserDO> selectAllUser();
}
