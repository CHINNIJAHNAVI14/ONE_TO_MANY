package com.hibernate.one_to_many_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.one_to_many_mapping.entity.Answer;
import com.hibernate.one_to_many_mapping.repository.AnswerRepository;

@Service
public class AnswerService
{
	@Autowired
	private AnswerRepository answerRepository;

	
	public void saveAnswer(Answer answer)
	{
		answerRepository.save(answer);
	}
	public List<Answer> getAll()
	{
		List<Answer> answer = new ArrayList<>();
		answerRepository.findAll().forEach(answer::add);
		return answer;
	}	 
}
