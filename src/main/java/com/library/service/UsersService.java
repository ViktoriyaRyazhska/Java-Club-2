package com.library.service;

import com.library.model.Users;

import java.util.List;

public interface UsersService {
    void create(Users user);
    Users read(Users user);
    List<Users> readByParam(Users user);
    List<Users> readAll();
    void update(Users base, Users update_from);
    void delete(Users user);
}
