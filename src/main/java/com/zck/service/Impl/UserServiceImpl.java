package com.zck.service.Impl;

import com.zck.dao.UserDAO;
import com.zck.domain.UserDO;
import com.zck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zck
 * @date 2020/12/24 15:16
 * @ClassName UserServiceImpl
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public int addUser(UserDO user) {
        return userDAO.addUser(user);
    }

    public int deleteUser(Integer id) {
        return userDAO.deleteUser(id);
    }

    public int updateUser(UserDO user) {
        return userDAO.updateUser(user);
    }

    public UserDO selectById(Integer id) {
        return userDAO.selectById(id);
    }

    public List<UserDO> selectAllUser() {
        return userDAO.selectAllUser();
    }
}
