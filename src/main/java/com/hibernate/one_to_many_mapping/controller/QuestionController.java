package com.hibernate.one_to_many_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.one_to_many_mapping.entity.Question;
import com.hibernate.one_to_many_mapping.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController 
{
	@Autowired
	private QuestionService questionService;
	
	@PostMapping
	public void createQuestion(@RequestBody Question question)
	{
		questionService.saveQuestion(question);
	}
	
	@GetMapping
	public List<Question> getAllUser()
	{
		return questionService.getAll();
	}
	

}

















/*package com.hibernate.one_to_many_mapping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.one_to_many_mapping.entity.Answer;
import com.hibernate.one_to_many_mapping.entity.Question;
import com.hibernate.one_to_many_mapping.entity.QuestionWithAnswersDto;
import com.hibernate.one_to_many_mapping.repository.AnswerRepository;
import com.hibernate.one_to_many_mapping.repository.QuestionRepository;
import com.hibernate.one_to_many_mapping.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController 
{
	 @Autowired
	 private QuestionRepository questionRepository;

	
	
	@Autowired
    private AnswerRepository answerRepository;

    @PostMapping("/questions")
    public Question createQuestion(@RequestBody QuestionWithAnswersDto questionDto) {
        Question question = new Question();
        question.setText(questionDto.getQuestionText());
        Question savedQuestion = questionRepository.save(question);

        List<Answer> answers = new ArrayList<>();
        for (String answerText : questionDto.getAnswers()) {
            Answer answer = new Answer();
            answer.setAnswerName(answerText);
            answer.setQuestion(savedQuestion);
            answers.add(answer);
        }

        answerRepository.saveAll(answers);

        return savedQuestion;
    }

}
*/