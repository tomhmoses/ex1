package com.bham.pij.exercises.e1f;

//TOM MOSES 1911437

import java.util.Scanner;
public class ShortAddressFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your full address:");
        String address = in.nextLine();
        System.out.println(ShortAddressFinder.findShortAddress(address));
        
    }
    
    public static String findShortAddress(String input) {
        if (input == null || input == "") {
            return null;
        }
        
        String[] parts = input.split(",\\s+");
        
        if (parts.length < 2) {
            return null;
        }
        
        String postCode = parts[parts.length - 1];
        
        //checks if post code format is right
        if (postCode.length() != 6) {
            return null;
        }
        char[] chars = postCode.toCharArray();
        if (!(Character.isLetter(chars[0]) && Character.isDigit(chars[1])
            && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
            && Character.isLetter(chars[4]) && Character.isLetter(chars[5]) )) {
            return null;
        }
        
        
        String shortAddress = parts[0] + " " + postCode;
        
        return shortAddress; 
        
    }

}
