package com.ua.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatedOrderDto {

	private long id;
	
	private long statusId;
	
	private long bookCopyId;
	
}
