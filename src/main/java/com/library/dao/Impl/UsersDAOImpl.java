package com.library.dao.Impl;

import com.library.dao.UsersDAO;
import com.library.model.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UsersDAOImpl implements UsersDAO {
    //TODO
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void create(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public Users read(Users user) {

        Map<String, Boolean> params = new HashMap<>();
        if (user.getId() != null) { //id
            params.put("id", true);
        }
        if (user.getRole() != null) { //role
            params.put("role", true);
        }
        if (user.getFirstName() != null) { //firstName
            params.put("firstName", true);
        }
        if (user.getLastName() != null) { //lastName
            params.put("lastName", true);
        }
        if (user.getBirthdate() != null) { //birthdate
            params.put("birthdate", true);
        }
        if (user.getEmail() != null) { //email
            params.put("email", true);
        }
        @SuppressWarnings("unchecked")
        TypedQuery<Users> query = sessionFactory.getCurrentSession().createQuery("from Users " +
                "where " +
                (params.get("id") ? ("id="+user.getId()+" and ") : "") +
                (params.get("role") ? ("role="+ user.getRole()+" and ") : "") +
                (params.get("firstName") ? ("firstName="+ user.getFirstName()+" and ") : "") +
                (params.get("lastName") ? ("lastName="+ user.getLastName()+" and ") : "") +
                (params.get("birthdate") ? ("birthdate="+ user.getBirthdate()+" and ") : "") +
                (params.get("email") ? ("email="+ user.getEmail()+" and ") : ""));
        return query.getSingleResult();
    }

    @Override
    public List<Users> readAll() {
        @SuppressWarnings("unchecked")
        TypedQuery<Users> query = sessionFactory.getCurrentSession().createQuery("from Users");
        return query.getResultList();
    }

    @Override
    public void update(Users base, Users update_from) {
        if (!base.getRole().equals(update_from.getRole())) { //role
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getRole()), base);
        }
        if (!base.getFirstName().equals(update_from.getFirstName())) { //firstName
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getFirstName()), base);
        }
        if (!base.getLastName().equals(update_from.getLastName())) { //lastName
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getLastName()), base);
        }
        if (!base.getBirthdate().equals(update_from.getBirthdate())) { //birthdate
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getBirthdate()), base);
        }
        if (!base.getEmail().equals(update_from.getEmail())) { //email
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getEmail()), base);
        }
        if (!base.getPassword().equals(update_from.getPassword())) { //password
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getPassword()), base);
        }
        if (!base.getIsDeleted().equals(update_from.getIsDeleted())) { //isDeleted
            sessionFactory.getCurrentSession().update(String.valueOf(update_from.getIsDeleted()), base);
        }
    }

    @Override
    public void delete(Users user) {
        sessionFactory.getCurrentSession().delete(user);
    }
}
