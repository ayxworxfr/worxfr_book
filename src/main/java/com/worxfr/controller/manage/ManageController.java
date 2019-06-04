package com.worxfr.controller.manage;


import com.worxfr.common.Const;
import com.worxfr.common.ServerResponse;
import com.worxfr.pojo.User;
import com.worxfr.service.IManageService;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    IManageService manageService;

    /**
     * 管理员登录
     */
    @PostMapping("/login")
    public ServerResponse login(@RequestBody String username, String password, HttpSession session) {
        ServerResponse<Manager> serverResponse = manageService.login(username, password);
        if (serverResponse.isSuccess()) {
            Manager manager = serverResponse.getData();
            session.setAttribute(Const.CURRENT_USER,manager);
        }
        return serverResponse;
    }

    /**
     * 管理员密码修改
     */
    @PutMapping("/password")
    public ServerResponse revise(String username, String oldPassword, String newPassword) {
        ServerResponse serverResponse = manageService.revise(username, oldPassword, newPassword);
        return serverResponse;
    }

    /**
     * 查看所有用户数据
     */
    @GetMapping("/users")
    public ServerResponse<List<User>> getAllUser(User user){
        ServerResponse<List<User>> serverResponse=manageService.Users();
        return serverResponse;
    }


    /**
     * 用户添加
     */
    @PostMapping("/insertUser")
    public ServerResponse addUser(@RequestBody User user) {
        ServerResponse serverResponse = manageService.addUser(user);
        return serverResponse;
    }

    /**
     * 用户删除
     */
    @DeleteMapping("/deleteUser/{id}")
    public ServerResponse outUser(@PathVariable("id") Integer id) {
        ServerResponse serverResponse = manageService.outUser(id);
        return serverResponse;
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/reviseUser")
    public ServerResponse reviseUser(@RequestBody User user) {
        ServerResponse serverResponse = manageService.reviseUser(user);
        return serverResponse;
    }
}
