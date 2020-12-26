package com.zck.controller;

import com.zck.domain.UserDO;
import com.zck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * @author zck
 * @date 2020/12/25 14:31
 * @ClassName UserController
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("userList")
    public String getALLUser(Model model) {
        List<UserDO> userList = userService.selectAllUser();
        model.addAttribute("userList",userList);
        return "userList";
    }

    @RequestMapping("/toAddUser")
    public String toAddUser() {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(UserDO user) {
        userService.addUser(user);
        return "redirect:/user/userList";
    }

    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Integer id, Model model) {
        UserDO user = userService.selectById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping("/updateUser")
    public String updateUser(UserDO user) {
        userService.updateUser(user);
        return "redirect:/user/userList";
    }

    @RequestMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id) {
        userService.deleteUser(id);
        return "redirect:/user/userList";
    }

}
