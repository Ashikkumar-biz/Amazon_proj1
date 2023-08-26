package com.iprograms;

import java.util.Arrays;

public class Reverse_String_Characters_All_Types {
	
	public static void main (String args[]) {
		String input = "How are you?";
		System.out.println(input);
		reverseWord(input);
		reverseFullString(input);
		reverseCharactersNotWords(input);
		reverseCharactersNotWords_WithoutStringBuilder(input);
	}
	
	//1. Reverse words in a string
	public static void reverseWord(String str) {
		String[] word = str.split("\\s+");
		StringBuilder output = new StringBuilder();
		for (int i=word.length-1; i>=0; i--) {
			String x= word[i];
			output.append(x);
			output.append(" ");
			
		}
		System.out.println(output.toString());
	}
			
	//2. Reverse the entire String
	public static void reverseFullString(String str) {
		StringBuilder output = new StringBuilder();
		for (int i=str.length()-1; i>=0;i--) {
			char x = str.charAt(i);
			output.append(x);
		}
		System.out.println(output.toString());
	}
	
	//3.Dont Reverse the word Reverse the characters alone using StringBuilder
	public static void reverseCharactersNotWords(String str) {
		String[] wordArray = str.split("\\s+");
		StringBuilder[] output = new StringBuilder[wordArray.length];
		for (int i=0; i<wordArray.length;i++) {
			String eachWord = wordArray[i];
			StringBuilder reverseWord = new StringBuilder(eachWord);
			output[i] = reverseWord.reverse();//reverse method is used to reverse
			
		}
		StringBuilder finalOutput = new StringBuilder();
		for (StringBuilder x : output) {
			finalOutput.append(x);
			finalOutput.append(" ");
		}
		System.out.println(finalOutput.toString().trim());//trim will trim trailing space
		
			
		}
	
	//4.Dont Reverse the word Reverse the characters alone without using StringBuilder
	public  static void reverseCharactersNotWords_WithoutStringBuilder(String str) {
		String[] wordArray = str.split("\\s+");
		String reversedString = new String();
		
		for(int i=0; i<wordArray.length; i++) {
			char[] word = wordArray[i].toCharArray();
			int left = 0;
			int right = word.length-1;
			
			while(left<right) {
				char temp = word[left];
				word[left]=word[right];
				word[right]= temp;
				left++;
				right--;
				
			}
			String x= new String(word);
			reversedString += x;
			reversedString += " ";
			
		}
		System.out.println(reversedString);
		}
	
	
	}

