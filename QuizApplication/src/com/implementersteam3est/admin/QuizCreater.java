package com.implementersteam3est.admin;

import java.util.Scanner;

public class QuizCreater {
	
	String [][]questions = new String[2][4];
	//String []options = new String[4];
	String []correctAnswers = new String[2];
      
	public void getQuestion() {
		
		int countQuestions = 1;
		
		
//		String []Q1Options = new String[4];
//		String []QuestionOneOptions= = new String[4];
//		String []QuestionTwoOptions = new String[4];
//		String []QuestionThreeOptions = new String[4];
//		String []QuestionFourOptions = new String[4];
//		String []QuestionFiveOptions = new String[4];
		
		for(int i = 0; i < questions.length; i++) {
			
			Scanner scanQuestion = new Scanner(System.in);
			System.out.println("Please enter your question no "+countQuestions);
			String question = scanQuestion.nextLine();
			//questions[i][] = question;
			int countOptions = 1;
			for(int j = 0; j < questions[i].length; j++) {
				Scanner scanOptions = new Scanner(System.in);
			    System.out.println("Please Enter your option no "+countOptions);
			    String option = scanOptions.nextLine();
				countOptions++;
			}
			countQuestions++;
			Scanner scanAnswer = new Scanner(System.in);
			System.out.println("Please enter correct answer for this question");
			String correctAnswer = scanAnswer.nextLine();
			correctAnswers[i] = correctAnswer;
			
		}
//      TO DO : Printing the element of multi-dimensional array
//
//        for(int i = 0; i < questions.length; i++) {
//        	for(int j = 0; j < questions[i].length; j++) {
//            	System.out.print(questions[i][j]+" ");
//            	System.out.println("");
//            }
//        }
	}
	
}
