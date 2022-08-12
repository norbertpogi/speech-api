package com.berttest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berttest.springboot.model.Speech;

@Repository
public interface SpeechRepository extends JpaRepository<Speech, Long> {

	Speech findByAuthor(String searchKey);

	Speech findBySubject(String searchKey);

	Speech findByContent(String searchKey);

}
