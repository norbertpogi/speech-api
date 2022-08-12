package com.berttest.springboot.dto;

import lombok.Data;

@Data
public class SpeechDTO {

	private Long id;
	private String title;
	private String author;
	private String content;
	private String subject;

}
