package com.implementers_team3_est.main;

import com.implementers_team3_est.players.Player;
import com.implementersteam3est.admin.AdminService;
import com.implementersteam3est.admin.QuizCreater;
import com.implementersteam3est.admin.QuizService;

public class Main {

	public static void main(String[] args) {
//      Ashim Code		
//		System.out.println("This is Quiz App.");
//        QuizCreater create = new QuizCreater();
//        create.getQuestion();
        // Player start = new Player();
        // start.playQuiz();
		
		AdminService as = new AdminService();

		System.out.println("Welcome to Quiz App!\n");


		System.out.println("Now Admin Can Enter Questions");
		System.out.println();
		as.inputQuestionsAndAnswers(); // Input questions and answers
		as.printQuestionsAndAnswers(); // Print questions and answers
		System.out.println("*********************************-----------------------***************");
		System.out.println("Student can start the quiz");
		System.out.println();
		QuizService qs = new QuizService(as.numberofQuestions, as.questionsAndOptions, as.correctAnswer);
		qs.takeTest(); // Take the test
	}

}
