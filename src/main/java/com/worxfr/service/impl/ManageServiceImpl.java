package com.worxfr.service.impl;


import com.worxfr.common.ServerResponse;
import com.worxfr.pojo.User;
import com.worxfr.service.IManageService;
import org.apache.catalina.Manager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements IManageService {
    @Override
    public ServerResponse<Manager> login(String username, String password) {
        return null;
    }

    @Override
    public ServerResponse revise(String username, String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public ServerResponse<List<User>> Users() {
        return null;
    }

    @Override
    public ServerResponse addUser(User user) {
        return null;
    }

    @Override
    public ServerResponse outUser(Integer id) {
        return null;
    }

    @Override
    public ServerResponse reviseUser(User user) {
        return null;
    }
}
