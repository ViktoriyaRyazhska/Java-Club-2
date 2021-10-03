package com.ua.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ua.dao.BookDao;
import com.ua.entity.Author;
import com.ua.entity.Book;
import com.ua.entity.BookCopy;
import com.ua.service.BookCopyService;
import com.ua.service.BookService;

@Transactional
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Autowired 
	BookCopyService bookCopyService;
	
	@Override
	public void saveBook(Book book) {
		bookDao.saveBook(book);
		
	}

	@Override
	public void updateBook(Book book) {
		bookDao.updateBook(book);
		
	}

	@Override
	public Book getBookById(Long id) {

		return bookDao.getBookById(id);
	}

	@Override
	public void deleteById(Long id) {
		bookDao.deleteById(id);
		
	}

	@Override
	public List<Book> findAll() {
		
		return bookDao.findAll();
	}

	@Override
	public List<Book> findByTitle(String title) {
		
		return bookDao.findByTitle(title + "%");
	}

	@Override
	public void createBookCopys(Book book, int copyCount) {
		List<BookCopy> bookCopies = book.getBookCopies();
		for (int i = 0; i < copyCount; i++) {
			
			BookCopy bookCopy = new BookCopy();
			bookCopy.setBook(book);
			bookCopies.add(bookCopy);
			bookCopyService.saveBookCopy(bookCopy);
			
		}

	}

	@Override
	public List<Author> findCoAuthors(Long id) {
		return bookDao.findCoAuthors(id);
	}

}
