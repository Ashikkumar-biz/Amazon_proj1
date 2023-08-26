package com.interviewPrograms;
import java.util.Scanner;

public class RemoveDuplicates_String {

	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter a string: ");
				String str = input.nextLine();

				String result = removeDuplicates(str);
				System.out.println("String after removing duplicates: " + result);
			}
	    }

	    public static String removeDuplicates(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            if (!result.contains(String.valueOf(str.charAt(i)))) {
	                result += str.charAt(i);
	            }
	        }
	        return result;
	    }
	}


