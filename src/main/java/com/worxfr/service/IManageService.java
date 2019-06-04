package com.worxfr.service;


import com.worxfr.common.ServerResponse;
import com.worxfr.pojo.User;
import org.apache.catalina.Manager;

import java.util.List;

public interface IManageService {

    ServerResponse<Manager> login(String username, String password);

    ServerResponse revise(String username, String oldPassword, String newPassword);

    ServerResponse<List<User>> Users();

    ServerResponse addUser(User user);

    ServerResponse outUser(Integer id);

    ServerResponse reviseUser(User user);
}
