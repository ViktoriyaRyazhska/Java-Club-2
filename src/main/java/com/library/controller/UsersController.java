package com.library.controller;

import com.library.model.Users;
import com.library.model.enums.Role;
import com.library.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.Date;
import java.util.List;

@Controller
public class UsersController {
    //TODO
    @Autowired
    UsersService service;

    public void create(Users user) {
        service.create(user);
    };
    public Users read(Users user) {
        return service.read(user);
    };
    public List<Users> readAll() {
        return service.readAll();
    };
    public void update(Users base, Users update_from) {
        service.update(base, update_from);
    };
    public void delete(Users user) {
        service.delete(user);
    };
}
