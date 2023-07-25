package com.hibernate.one_to_many_mapping.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="qu")
public class Question 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String question;
	@OneToMany(targetEntity = Answer.class,cascade = CascadeType.ALL)
	@JoinColumn(name="qid",referencedColumnName = "id")
	private List<Answer> answer;

	public Question() {}

	public Question(int id, String question, List<Answer> answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}




	public List<Answer> getAnswer() {
		return answer;
	}




	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	


	
	


	
	

}
