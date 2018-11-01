package com.bham.pij.exercises.e1b;

//TOM MOSES 1911437

import java.util.Scanner;
public class MeanGrade {

    public static void main(String[] args) {
        int[] grades = new int[4];
        
        for (int count = 0; count <= 3; count++) {
            grades[count] = MeanGrade.getGrade();
        }
        double avg = MeanGrade.computeMean(grades);
        System.out.println("average grade is:");
        System.out.println(avg);

    }
    
    public static int getGrade() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the grade:");
        int grade = in.nextInt();
        return grade;
    }
    
    public static boolean isValid(int grade) {
        boolean valid = 0 <= grade && grade <= 100;
        return valid;
    }
    
    public static double computeMean(int[] grades) {
        double gradesTotal = 0.0;
        int numOfValidGrades = 0;
        for (int count=0; count<grades.length; count++)
        {
          if(MeanGrade.isValid(grades[count])) {
              gradesTotal += grades[count];
              numOfValidGrades += 1;
          }
        }
        double avg = gradesTotal / numOfValidGrades;
        return avg;
        
    }

}
