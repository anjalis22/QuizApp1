package com.implementersteam3est.admin;


import java.util.Scanner;

public class QuizService {
	private int numberofQuestions;
	private String[][] questionsAndOptions;
	private String[] correctAnswer;

	public QuizService(int numberOfQuestions, String[][] questionsAndOptions, String[] correctAnswer) {
		this.numberofQuestions = numberOfQuestions;
		this.questionsAndOptions = questionsAndOptions;
		this.correctAnswer = correctAnswer;
	}

	
	public void takeTest() {
		int score = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < numberofQuestions; i++) {
			// Display the question and options to the player
			System.out.println("Question " + (i + 1) + ": " + questionsAndOptions[i][0]);
			for (int j = 1; j < questionsAndOptions[i].length; j++) {
				System.out.println("Option " + j + ": " + questionsAndOptions[i][j]);
			}

			String answer = scanner.nextLine();
			if (answer.equals(correctAnswer[i])) {
				score += 2;
			} else if (answer.isEmpty()) {
				// Handle the case where the user skips the question (score remains the same)
			} else {
				score -= 1;
			}
		}

		System.out.println("You got " + score + "/" + (questionsAndOptions.length * 2));
	}


}




//	public QuizService() {
//
//		questions[0] = new Question("Can we overload a main method in java?\n a)Yes\n b) No", "a");
//		questions[1] = new Question("Which of the following modifier should not be used with interface methods?\n"
//				+ "a)private\n b)public\n c)final\n d)static", "c");
//		questions[2] = new Question("How many interfaces can a class implement in java?\n"
//				+ "a)only one\n b)up to three\n c)As many as needed\n d)None", "c");
//		questions[3] = new Question("What is the primary purpose of the enhanced for loop in java?\n"
//				+ "a)iterate through an array or collection sequentially\n"
//				+ "b)create nested loops\n c)Break out of a loop\n d)Execute a loop conditionally", "a");
//		questions[4] = new Question("Can the enhanced for loop iterate in reverse order?\n a)Yes\n b)No", "b");
//		questions[5] = new Question("What is the return type of the compareTo() method in java?\n"
//				+ "a)boolean\n b)char\n c)int\n d)float", "c");
//		Question[] questions = { new Question(q1, "a"), new Question(q2, "c"), new Question(q3, "c"),
//
//				new Question(q4, "a"), new Question(q5, "b"), new Question(q6, "c") };

	// }

//	public void playQuiz() {
//		for (Question q : questions) {
//
//			System.out.println(q.getQuestion());
//		}
//	}


