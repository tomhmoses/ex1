package com.bham.pij.exercises.e1d;

//TOM MOSES 1911437

import java.util.Scanner;
public class IDCreator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your full name:");
        String name = in.nextLine();
        System.out.println(IDCreator.createID(name));
    }
    
    public static String createID(String input) {
        if(input == null || input == "") {
            return null;
        }
        String[] names = input.split("\\s+");
        // "\\s+" is the regex whitespace
        if(names.length > 3 || names.length < 2) {
            return null;
        }
        
        String ID = "";
        ID += Character.toString(names[0].charAt(0));
        if(names.length == 2) {
            ID += "X";
            ID += Character.toString(names[1].charAt(0));
        }
        else {
            ID += Character.toString(names[1].charAt(0));
            ID += Character.toString(names[2].charAt(0));
        }
        
        
        return ID.toLowerCase();
    }

}
