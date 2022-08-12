package com.berttest.springboot.mapper;

import org.mapstruct.Mapper;

import com.berttest.springboot.dto.SpeechDTO;
import com.berttest.springboot.model.Speech;

@Mapper
public interface SpeechMapper {

	SpeechDTO toSpeechDTO(Speech speech);
}
