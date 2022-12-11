package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Score extends MCQ{
	String z;
	String a;
	public void returnScore() throws SQLException{
	
		int count = 0;
		
		try {
			Class.forName("jdbc.mysql.cj.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","root");
			    Scanner sc =new Scanner(System.in);
			    System.out.print("Roll no:");
			    int rollNo = sc.nextInt();
			    System.out.print("Name:");
			    String name = sc.next();

		           
			
		PreparedStatement pst = con.prepareStatement("insert into result(Student_id,Student_name,Score) values (?,?,?)");
	    PreparedStatement pst1 = con.prepareStatement("Select Correct_Answer from score");
	    ResultSet rs =pst1.executeQuery();
	    while(rs.next()) {
               a = rs.getString(3);
               System.out.println(a);
               z =super.ans;
               System.out.println(z);
               
         }
	    if(a==z) {
			    count = count+1;
		}
	    pst.setInt(1, rollNo);
		pst.setString(2, name);
        pst.setInt(3, count);
		pst.execute();
		
	}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total Score is:"+ count);
		
		
	    
	    

		
	}

}


