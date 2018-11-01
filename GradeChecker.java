package com.bham.pij.exercises.e1a;

//TOM MOSES 1911437

import java.util.Scanner;
public class GradeChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int grade = in.nextInt();
        
        if(GradeChecker.isValid(grade)) {
            if (GradeChecker.isPass(grade)) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
        else {
            System.out.println("Invalid input");
        }
        

    }
    
    
    public static boolean isValid(int grade) {
        boolean valid = 0 <= grade && grade <= 100;
        return valid;
    }
    
    public static boolean isPass(int grade) {
        boolean pass = grade >= 40;
        return pass;
        
    }

}
