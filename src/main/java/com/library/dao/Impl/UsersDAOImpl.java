package com.library.dao.Impl;

import com.library.dao.UsersDAO;
import com.library.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Repository
public class UsersDAOImpl implements UsersDAO {
    //TODO
    final
    SessionFactory sessionFactory;

    public UsersDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //Crud
    @Override
    public void create(Users user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    //cRud
    @Transactional(readOnly = true)
    @Override
    public Users read(Users user) {
        Session session = sessionFactory.getCurrentSession();

        Map<String, Boolean> params = new HashMap<>();
        if (user.getId() != null) { //id
            params.put("id", true);
        } else params.put("id", false);
        if (user.getEmail() != null) { //email
            params.put("email", true);
        } else params.put("email", false);
        Users res = session.get(Users.class,
                (params.get("id")) ? user.getId() :
                        (params.get("email")) ? user.getEmail() : "null");
        return res;
    }


    @Transactional(readOnly = true)
    @Override
    public List<Users> readByParam(Users user) {
        Session session = sessionFactory.getCurrentSession();
        boolean fatr = false;
        String query = "from users where ";

        if (user.getRole() != null) { //role
            query += "role=" + user.getRole();
            fatr=true;
        }
        if (user.getFirstName() != null) { //firstName
            if (fatr) {
                query += " and ";
            } else fatr=true;
            query += "firstName=" + user.getFirstName();
        }
        if (user.getLastName() != null) { //lastName
            if (fatr) {
                query += " and ";
            } else fatr=true;
            query += "lastName=" + user.getLastName();
        }
        if (user.getBirthdate() != null) { //birthdate
            if (fatr) {
                query += " and ";
            } else fatr=true;
            query += "birthdate=" + user.getBirthdate();
        }
        @SuppressWarnings("unchecked")
        TypedQuery<Users> q = session.createQuery(query);
        return q.getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Users> readAll() {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        TypedQuery<Users> query = session.createQuery("from Users");
        return query.getResultList();
    }

    //crUd
    @Override
    public void update(Users base, Users update_from) {
        Session session = sessionFactory.getCurrentSession();
        base = read(base);
        if (!base.getRole().equals(update_from.getRole())) { //role
            session.update(String.valueOf(update_from.getRole()), base);
        }
        if (!base.getFirstName().equals(update_from.getFirstName())) { //firstName
            session.update(String.valueOf(update_from.getFirstName()), base);
        }
        if (!base.getLastName().equals(update_from.getLastName())) { //lastName
            session.update(String.valueOf(update_from.getLastName()), base);
        }
        if (!base.getBirthdate().equals(update_from.getBirthdate())) { //birthdate
            session.update(String.valueOf(update_from.getBirthdate()), base);
        }
        if (!base.getEmail().equals(update_from.getEmail())) { //email
            session.update(String.valueOf(update_from.getEmail()), base);
        }
        if (!base.getPassword().equals(update_from.getPassword())) { //password
            session.update(String.valueOf(update_from.getPassword()), base);
        }
        if (!base.getIsDeleted().equals(update_from.getIsDeleted())) { //isDeleted
            session.update(String.valueOf(update_from.getIsDeleted()), base);
        }
    }

    //cruD
    @Override
    public void delete(Users user) {
        Session session = sessionFactory.getCurrentSession();
        user = read(user);
        session.delete(user);
    }
}
