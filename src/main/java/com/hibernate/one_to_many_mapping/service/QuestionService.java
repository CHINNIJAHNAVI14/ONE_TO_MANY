package com.hibernate.one_to_many_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.one_to_many_mapping.entity.Question;
import com.hibernate.one_to_many_mapping.repository.QuestionRepository;


@Service
public class QuestionService 
{
	@Autowired
	private QuestionRepository questionRepository;
	
	public void saveQuestion(Question question)
	{
		questionRepository.save(question);
	}
	
	public List<Question> getAll()
	{
		List<Question> question = new ArrayList<>();
		questionRepository.findAll().forEach(question::add);
		return question;
	}
	



}
