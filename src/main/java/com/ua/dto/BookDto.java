package com.ua.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class BookDto {


	private long id;
	
	private String title;
	
	private String description;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date publicationDate;
	
	private String authorFirstName;
	
	private String authorLastName;
	
	private String coauthors;
	
	private String genre;
	
	private int availableCopys;
}
