package com.ua.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book", indexes = @Index(columnList = "title"))
public class Book extends BaseEntity{

	private String  title;
	
	private String description;
	
	private Date publicationDate;
	
	@ManyToOne
	private Author bookAuthor;
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany(cascade = CascadeType.ALL,
			mappedBy = "co_bookList")
	private List<Author> co_Authors = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "book")
	private List<BookCopy> bookCopies = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
	private List<BookOrder> bookOrders = new ArrayList<>();
}
