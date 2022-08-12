package com.berttest.springboot.controller;

import javax.swing.text.StyleContext.SmallAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berttest.springboot.dto.SpeechDTO;
import com.berttest.springboot.mapper.SpeechMapper;
import com.berttest.springboot.model.Speech;
import com.berttest.springboot.service.SpeechService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class SpeechController {

	private SpeechService speechService;

	@Autowired
	public SpeechController(SpeechService speechService) {
		this.speechService = speechService;
	}

	@PostMapping("/speech")
	public ResponseEntity<Speech> createSpeech() {
		Speech spCR = speechService.createdSpeech();
		return new ResponseEntity<>(spCR, HttpStatus.CREATED);

	}

	@GetMapping("/search/{searchKey}")
	public ResponseEntity<Speech> getSpeechByRecord(@PathVariable("searchKey") String searchKey) {
		Speech sp = speechService.retrieveSpeechRecord(searchKey);
		return null != sp ? new ResponseEntity<>(sp, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
