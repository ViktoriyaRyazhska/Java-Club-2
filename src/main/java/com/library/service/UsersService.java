package com.library.service;

import com.library.model.Users;

import java.util.List;

public interface UsersService {
    //TODO
    public void create(Users user);
    public Users read(Users user);
    public List<Users> readAll();
    public void update(Users base, Users update_from);
    public void delete(Users user);
}
