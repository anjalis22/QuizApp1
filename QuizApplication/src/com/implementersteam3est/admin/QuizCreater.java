package com.implementersteam3est.admin;

import java.util.Scanner;

public class QuizCreater {
	
	Question []questionObjectArray = new Question[2];
	
	Question questionObject = new Question();
	
	String []questions = new String[2];
	String []options = new String[4];
	
	static int score = 0;
      
	public Question[] getQuestion() {
		
		

		int countQuestions = 1;
		
		for(int i = 0; i < questions.length; i++) {
			
			// taking question title from the user
			Scanner scanQuestion = new Scanner(System.in);
			System.out.println("Please enter your question no "+countQuestions);
			String question = scanQuestion.nextLine();
			questionObject.setTitle(question); 
			
			
			// taking the options for the question from user
			int countOptions = 1;
			
			for(int j = 0; j < options.length; j++) {
				Scanner scanOptions = new Scanner(System.in);
			    System.out.println("Please Enter your option no "+countOptions);
			    String option = scanOptions.nextLine();
			    options[j] = option;
				countOptions++;
			}
			questionObject.setOptions(options);
			countQuestions++;
			
			// taking the correct answer input 
			Scanner scanAnswer = new Scanner(System.in);
			System.out.println("Please enter correct answer for this question");
			String correctAnswer = scanAnswer.nextLine();
			questionObject.setAnswer(correctAnswer);
			
			// storing new data in the question object
			String nextTitle = questionObject.getTitle();
			String []nextOptions = questionObject.getOptions();
			String nextAnswer = questionObject.getAnswer();
			
			// storing in the object array 
			questionObjectArray[i] = new Question(nextTitle, nextOptions, nextAnswer);
			
			
			
		}
        // print question object array
        for(Question myQ : questionObjectArray) {
        	System.out.println(myQ);
        }
        
        return 	 this.questionObjectArray;
        
//        System.out.println("Are you ready to play now!! Best of luck");
//        System.out.println("Press 0 to skip question!");
//		
//		for(int i = 0; i < questionObjectArray.length; i ++) {
//			System.out.println(questionObjectArray[i].getTitle());
//			for(int j = 0; j < 4; j++) {
//				System.out.println(questionObjectArray[i].getOptions()[j]);
//			}
//			Scanner scan = new Scanner(System.in);
//		    String answer = scan.nextLine();
//		    if(questionObjectArray[i].getAnswer().equals(answer)) {
//		    	score =+ 2;
//		    } else if (questionObjectArray[i].getAnswer().equals("0")) {
//		    	score =+ 0;
//		    } else {
//		    	score =- 1;
//		    }
//		}
//		if(score < 0) {
//			System.out.println("Your score is "+ 0);
//		} else {
//			System.out.println("Your score is "+ score);
//		}
        

	}
	

//	public Question[] getQuestionObjectArray() {
//     	return this.questionObjectArray;
//    }
	
}
