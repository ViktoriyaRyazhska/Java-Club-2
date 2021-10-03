package com.ua.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ua.dao.BookOrderDao;
import com.ua.entity.BookOrder;

@Repository
public class BookOrderDaoImpl implements BookOrderDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSessionFactory() {
		
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveBookOrder(BookOrder bookOrder) {
		bookOrder.setCreatedAt(new Date());
		bookOrder.setUpdatedAt(new Date());
		getSessionFactory().save(bookOrder);
		
	}

	@Override
	public void updateBookOrder(BookOrder bookOrder) {
		bookOrder.setUpdatedAt(new Date());
		getSessionFactory().update(bookOrder);
		
	}

	@Override
	public BookOrder getBookOrderById(Long id) {
		return (BookOrder) getSessionFactory().get(BookOrder.class, id);
	}

	@Override
	public void deleteById(Long id) {
		BookOrder bookOrder = getBookOrderById(id);
		if (bookOrder != null) {
			getSessionFactory().delete(bookOrder);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookOrder> findAll() {
		return getSessionFactory().createQuery("from BookOrder").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookOrder> findAllByStatusIdByUserId(Long id, Long statusId) {
	
		return  getSessionFactory().createQuery("SELECT u FROM BookOrder u WHERE u.reader.id = :id and u.orderStatus.id = :statusid")
				.setParameter("id", id).setParameter("statusid", statusId).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookOrder> findAllByStatusId(long statusId) {
		return  getSessionFactory().createQuery("SELECT u FROM BookOrder u WHERE u.orderStatus.id = :statusid")
				.setParameter("statusid", statusId).list();
	}

}
