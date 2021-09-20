package com.library.dao;

import com.library.model.Users;

import java.util.List;

public interface UsersDAO {
    //CRUD
    //all through NotFoundException

    //C
    void create(Users user);

    //R
    Users read(Users user);
    List<Users> readByParam(Users user);
    List<Users> readAll();

    //U
    void update(Users base, Users update_from);

    //D
    void delete(Users user);
}
