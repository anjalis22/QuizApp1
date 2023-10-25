package com.implementersteam3est.admin;

import java.util.Arrays;

public class Question {

	private String title;
	private String []options;
	private String answer;
	
	public Question() {
		super();
	}

	public Question(String title, String[] options, String answer) {
		super();
		this.title = title;
		this.options = options;
		this.answer = answer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [title=" + title + ", options=" + Arrays.toString(options) + ", answer=" + answer + "]";
	}
	
	
	
	
	
}
