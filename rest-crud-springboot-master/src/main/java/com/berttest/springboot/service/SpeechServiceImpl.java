package com.berttest.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berttest.springboot.mapper.SpeechMapper;
import com.berttest.springboot.model.Speech;
import com.berttest.springboot.repository.SpeechRepository;

@Service
public class SpeechServiceImpl implements SpeechService {

	@Autowired
	private SpeechRepository speechRepository;

	@Override
	public Speech retrieveSpeechRecord(String searchKey) {
		Speech author = speechRepository.findByAuthor(searchKey);
		if (null != author) {
			return author;
		}
		Speech subject = speechRepository.findBySubject(searchKey);
		if (null != subject) {
			return subject;
		}
		Speech content = speechRepository.findByContent(searchKey);
		if (null != content) {
			return content;
		}
		return null;
	}

	@Override
	public Speech createdSpeech() {
		Speech spr = new Speech();
		spr.setAuthor("test-norbert");
		spr.setContent("test-content");
		spr.setSubject("test-subject");
		spr.setTitle("test-title");
		return speechRepository.save(spr);
	}

}
