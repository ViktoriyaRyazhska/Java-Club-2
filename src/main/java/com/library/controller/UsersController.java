package com.library.controller;

import com.library.model.Users;
import com.library.model.enums.Role;
import com.library.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class UsersController {
    private final UsersService service;

    public UsersController(UsersService service) {
        this.service = service;
    }

//    @GetMapping("/create")
//    public String create(Model model) {
//        Users user = new Users();
//        model.addAttribute("user", user);
//        return "user-form";
//    };

    @GetMapping("/create")
    public String create(Model model) {
        Users user = new Users();
        model.addAttribute("users", user);
        return "user-list";
    }

    @GetMapping("/create")
    public String create

    //TODO

    public Users read(Users user) {
        return service.read(user);
    };
    public List<Users> readByParam(Users user) {
        return service.readByParam(user);
    }
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
