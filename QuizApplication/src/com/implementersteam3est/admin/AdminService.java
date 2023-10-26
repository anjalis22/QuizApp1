package com.implementersteam3est.admin;


import java.util.Scanner;

public class AdminService {
	public int numberofQuestions;
	public String[][] questionsAndOptions;
	public String[] correctAnswer;



	public void inputQuestionsAndAnswers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of questions: ");
		numberofQuestions = sc.nextInt();
		sc.nextLine();
		questionsAndOptions = new String[numberofQuestions][5];
		correctAnswer = new String[numberofQuestions];

		for (int i = 0; i < numberofQuestions; i++) {
			System.out.println("Enter Question No : " + (i + 1));
			questionsAndOptions[i][0] = sc.nextLine();
			for (int j = 1; j < questionsAndOptions[i].length; j++) {
				System.out.println("Enter Options : " + (j) + " for question " + (i + 1));
				questionsAndOptions[i][j] = sc.nextLine();
			}
			System.out.println("Enter correct Anwser ");
			correctAnswer[i] = sc.nextLine();

		}
	}

	public void printQuestionsAndAnswers() {
		for (int i = 0; i < numberofQuestions; i++) {
			System.out.println("Question" + (i + 1) + " : " + questionsAndOptions[i][0]);
			for (int j = 1; j < questionsAndOptions[i].length; j++) {
				System.out.println("option" + j + " : " + questionsAndOptions[i][j]);
			}
			System.out.println("Correct Answer : " + correctAnswer[i]);
			System.out.println();

		}

	}


//	public static void printQuestionsAndAnswers1(String[][] questionsAndOptions) {
//		for (int i = 0; i < questionsAndOptions.length; i++) {
//			System.out.println("Question" + (i + 1) + " : " + questionsAndOptions[i][1]);
//			for (int j = 0; j < questionsAndOptions[i].length; j++) {
//				System.out.println("option" + j + ":" + questionsAndOptions[i][j]);
//			}
//			System.out.println();
//		}
//	}


}
