package com.berttest.springboot.service;

import com.berttest.springboot.model.Speech;

public interface SpeechService {

	Speech retrieveSpeechRecord(String searchKey);

	Speech createdSpeech();

}
