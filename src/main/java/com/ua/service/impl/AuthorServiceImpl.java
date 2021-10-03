package com.ua.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.dao.AuthorDao;
import com.ua.dao.BookDao;
import com.ua.entity.Author;
import com.ua.entity.Book;
import com.ua.service.AuthorService;

@Transactional
@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorDao authorDao;
	@Autowired 
	BookDao bookDao;
	
	@Override
	public void saveAuthor(Author author) {
		authorDao.saveAuthor(author);
		
	}

	@Override
	public void updateAuthor(Author author) {
		authorDao.updateAuthor(author);
		
	}

	@Override
	public Author getAuthorById(Long id) {
		return authorDao.getAuthorById(id);
	}

	@Override
	public void deleteById(Long id) {
		authorDao.deleteById(id);
		
	}

	@Override
	public List<Author> findAll() {
		return authorDao.findAll();
	}

	@Override
	public List<Author> findAllByName(String name) {
		return authorDao.findAllByName(name);
	}

	@Override
	public void addCoAuthor(Author author, Book book) {
		
		author.getCo_bookList().add(book);
		authorDao.updateAuthor(author);
		
	}

}
