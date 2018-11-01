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
        final int maxGrade = 100;
        boolean valid = 0 <= grade && grade <= maxGrade;
        return valid;
    }
    
    public static boolean isPass(int grade) {
        final int passGrade = 40;
        boolean pass = grade >= passGrade;
        return pass;
        
    }

}
