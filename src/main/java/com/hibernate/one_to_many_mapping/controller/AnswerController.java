package com.hibernate.one_to_many_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.one_to_many_mapping.entity.Answer;
import com.hibernate.one_to_many_mapping.service.AnswerService;

@RestController
@RequestMapping("/answer")
public class AnswerController 
{
	@Autowired
	private AnswerService answerService;
	
	@PostMapping
	public void createAnswer(@RequestBody Answer answer)
	{
		answerService.saveAnswer(answer);
	}
	
	@GetMapping
	public List<Answer> getAllUser()
	{
		return answerService.getAll();
	}
	

}































