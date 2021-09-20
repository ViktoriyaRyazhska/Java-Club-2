package com.library.service.Impl;

import com.library.dao.UsersDAO;
import com.library.model.Users;
import com.library.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersDAO dao;

    public UsersServiceImpl(UsersDAO dao) {
        this.dao = dao;
    }

    @Override
    public void create(Users user) {
        dao.create(user);
    }

    @Override
    public Users read(Users user) {
        return dao.read(user);
    }

    @Override
    public List<Users> readByParam(Users user) {
        return dao.readByParam(user);
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
