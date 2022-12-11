package com.quiz;

import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.util.Scanner;

public class Main extends MCQ {
	
	
  public static void main(String[] args) throws SQLException {
		MCQ mcq = new MCQ();
		mcq.randomQuestion();
		
		Score score = new Score();
		score.returnScore();
		
	}

}
