package com.implementers_team3_est.players;

import com.implementersteam3est.admin.Question;
import com.implementersteam3est.admin.QuizCreater;

public class Player {
	
	QuizCreater question = new QuizCreater();
	

	public void playQuiz(Question[] q) {
		
		System.out.println("Are you ready to play now!! Best of luck");
		
		for(int i = 0; i < q.length; i++ ) {
			
			System.out.println(q[i].getTitle());
			
		}
		
		
	}
}
