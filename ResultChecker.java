package com.bham.pij.exercises.e1c;

//TOM MOSES 1911437

import java.util.Scanner;
public class ResultChecker {

	public static void main(String[] args) {
		int[] grades = new int[9];
		grades[0] = ResultChecker.getProjectGrade();
		for (int count = 1; count <= 8; count++) {
			grades[count] = ResultChecker.getModuleGrade();
		}
		String result = ResultChecker.getResult(grades);
		System.out.println(result);

	}
	
	public static String getResult(int[] grades) {
		//checks for error
		for (int count=0; count<grades.length; count++)
		{
		  if(ResultChecker.isValid(grades[count]) == false) {
			  return "ERROR";
		  }
		}
		//checks if any are less than 40
		for (int count=0; count<grades.length; count++)
		{
		  if(ResultChecker.isPass(grades[count]) == false) {
			  return "FAIL";
		  }
		}
		//don't need to check if average is under 40, 
		//as for that one grade would need to be under 40 anyway.
		double meanModuleGrade = ResultChecker.computeModuleMean(grades);
		int projectGrade = grades[0];
		
		//now to find pass level
		if(meanModuleGrade < 50 || projectGrade < 50) { 
			return "PASS";
		}
		if(meanModuleGrade < 70 || projectGrade < 70) { 
			return "MERIT";
		}
		return "DISTINCTION";
		
		
	}
	
	public static double computeModuleMean(int[] grades) {
		double gradesTotal = 0.0;
		//item 0 is the project grade so we ignore it
		for (int count=1; count<grades.length; count++)
		{
		  gradesTotal += grades[count];
		  
		}
		double avg = gradesTotal / 8;
		return avg;
		
	}
	

	public static boolean isValid(int grade) {
		boolean valid = 0 <= grade && grade <= 100;
		return valid;
	}
	
	public static boolean isPass(int grade) {
		boolean pass = grade >= 40;
		return pass;
		
	}


	public static int getGrade(String type) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the " + type + " grade:");
		int grade = in.nextInt();
		return grade;
	}
	
	public static int getModuleGrade() {
		return ResultChecker.getGrade("module");
	}
	

	public static int getProjectGrade() {
		return ResultChecker.getGrade("project");
	}

}
