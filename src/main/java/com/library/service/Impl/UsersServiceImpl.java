package com.library.service.Impl;

import com.library.dao.UsersDAO;
import com.library.model.Users;
import com.library.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    //TODO
    @Autowired
    UsersDAO dao;

    @Override
    public void create(Users user) {
        dao.create(user);
    }

    @Override
    public Users read(Users user) {
        return dao.read(user);
    }

    @Override
    public List<Users> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Users base, Users update_from) {
        dao.update(base, update_from);
    }

    @Override
    public void delete(Users user) {
        dao.delete(user);
    }
}
