package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.lang.ClassNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MCQ {
//	
	 public String ans;
	 

	@SuppressWarnings({ "unchecked", "unused" })
	public void randomQuestion() throws SQLException {
	
		//1.load the Driver class
		try {
			   Class.forName("jdbc.mysql.cj.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		//establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","root");
	
		System.out.println("Let's Start the Quiz........");
		System.out.println();
		//prepared Statement/sql 
	
		PreparedStatement ps = con.prepareStatement("select * from questions");
		ResultSet rs =ps.executeQuery();
	    while(rs.next()) {

			@SuppressWarnings("rawtypes")
			HashSet<Integer> hs = new HashSet<Integer>();
			 System.out.println(rs.getString(2));
			    System.out.println("A " + rs.getString(3));
				System.out.println("B " +rs.getString(4));
				System.out.println("C "+ rs.getString(5));
				System.out.println("D "+ rs.getString(6));
//			hs.add(rs.getInt(1));
//			hs.add(rs.getInt(2));
//			hs.add(rs.getInt(3));
//			hs.add(rs.getInt(4));
//			hs.add(rs.getInt(5));
//			hs.add(rs.getInt(6));
//			hs.add(rs.getInt(7));
//			hs.add(rs.getInt(8));
//			hs.add(rs.getInt(9));
//			hs.add(rs.getInt(10));
			for(Integer num:hs) {
				System.out.println(num);
			}
//		    Iterator<Integer> itr = hs.iterator();
//		    while(itr.hasNext()) {
//		    	System.out.println(itr.next());
//		    }
//		    System.out.println(rs.getString(2));
//		    System.out.println("A " + rs.getString(3));
//			System.out.println("B " +rs.getString(4));
//			System.out.println("C "+ rs.getString(5));
//			System.out.println("D "+ rs.getString(6));
		    
			   Scanner sc = new Scanner(System.in);
		       System.out.print("Choose the Correct Option:");
   			   System.out.println(" ");
		        ans = sc.next();
			   
			   
		}// while loop
	   
	    
	}//method
} //class
	
	
	


	
	


