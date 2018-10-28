package com.bham.pij.exercises.e1e;

//TOM MOSES 1911437

import java.util.Scanner;
public class PasswordChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your new password:");
		String password = in.nextLine();
		System.out.println(PasswordChecker.checkPassword(password));

	}
	
	public static String checkPassword(String input) {
		String errors = "";
		if(input.length() < 8) {
			errors += "TOO SHORT, ";
		}
		
		if(input.length() > 12) {
			errors += "TOO LONG, ";
		}
		
		boolean passedCharTest = true;
		char[] chars = input.toCharArray();
		for (char c : chars) {
			if(!(Character.isLetter(c) || Character.isDigit(c) || c == "_".charAt(0))) {
				passedCharTest = false;
			}
		}
		if(!passedCharTest) {
			errors += "FAILED CHAR TEST, ";
		}
		if(input.length() > 0) {
			if(Character.isDigit(input.charAt(0))) {
				errors += "STARTS WITH DIGIT, ";
			}
		}
		
		if(input.toUpperCase() == input || input.toLowerCase() == input) {
			errors += "NO MIX OF CASE, ";
		}
		
		
		if(errors == "") {
			return "OK";
		}
		else {
			return errors.substring(0,errors.length()-2);
		}
	}

}
