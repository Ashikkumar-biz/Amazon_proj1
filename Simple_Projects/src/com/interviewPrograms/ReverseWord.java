package com.interviewPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words: ");
		int n = scan.nextInt();
		String[] sList = new String[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+ " word: ");
			sList[i] = scan.next();
		}
		System.out.println("The Correct format is ");

		for(int i=0; i<n; i++) 
		{
		System.out.println(sList[i]);
		}
//		
		System.out.println("The Reverse word is ");
		for (int i=n-1; i>=0; i--) 
		{
			System.out.println(sList[i]);
		}
		
		
//		String word = "Welcome Home dad";
//		String[] splitword =  word.split(" ");
//		ArrayList<String> splitwordL = new ArrayList<String>();
//		for (int i=splitword.length-1;i>=0; i--)
//		{
//			splitwordL.add(splitword[i]);
//		}
//		System.out.println(splitwordL);

	}

}
