package com.grs;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_char {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a word: ");
	    String word = input.nextLine();
	    
	    System.out.println("Original word: " + word);
	    
	    // Convert the word to a char array
	    char[] chars = word.toCharArray();
	    System.out.println("The Char is "+Arrays.toString(chars));
	    
	    // Reverse the char array
	    int start = 0;
	    int end = chars.length - 1;
	    while (start < end) {
	      char temp = chars[start];
	      chars[start] = chars[end];
	      chars[end] = temp;
	      start++;
	      end--;
	    }
	    
	    // Convert the reversed char array back to a string
	    //String reversedWord = new String(chars);
	    String reversedWord = new String(chars);
	    System.out.println("Reversed word: " + reversedWord);
	}

}
