package com.ua.service;

import java.util.List;

import com.ua.entity.Author;
import com.ua.entity.Book;

public interface AuthorService {

	void saveAuthor(Author author);
	void updateAuthor(Author author);
	Author getAuthorById(Long id);
	void deleteById(Long id);
	List<Author> findAll();
	List<Author> findAllByName(String name);
	void addCoAuthor(Author author, Book book);
}
