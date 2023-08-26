package com.grs;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter First Word:");
		String word1 = inp.nextLine();
		System.out.println("Enter Second Word:");
		String word2 = inp.nextLine();
		System.out.println("Before Swap: " + word1+" "+ word2);
		System.out.println("After Swap: "+ word2+ " "+ word1);
		
		
		
	}

}
