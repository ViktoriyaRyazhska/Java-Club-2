package com.library.dao;

import com.library.model.Users;

import java.util.List;

public interface UsersDAO {
    //CRUD
    //all through NotFoundException

    //C public void create();
    public void create(Users user);
//    public void create(String firstName, String lastName, String email, String password);
//
//    public void create(Role role, String firstName, String lastName, String email, String password);
//    public void create(String firstName, String lastName, Date birthdate, String email, String password);
//
//    public void create(Role role, String firstName, String lastName, Date birthdate, String email, String password);

    //R public Object read();
    public Users read(Users user);
    public List<Users> readAll();
//    public Users read(int id);
//    public Users read(String email);

    //U public void update();
    public void update(Users base, Users update_from);
//    public void update(Users base, int id);
//    public void update(Users base, String email);

    //D public void delete();
    public void delete(Users user);
}
