package com.utube;

import java.util.List;
import java.util.Scanner;

public class RepeatedWords {
////	private static void repeatedWords(String data) 
////	{
////		List<String> list = new List(data);
////	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String[] word = str.split(" ");
		int count;
		
		for (int i=0; i<word.length; i++)
		{
			count = 1 ;
			for (int j=i+1; j<word.length; j++) 
			{
				if(word[i].equals(word[j]))
				{
					//System.out.println(word[i]);
					count++;
					word[j]="0";
				}
				
			}
			if(word[i]!="0")
			{
				System.out.println(word[i]+"  "+count);
			}
		}
	}

}
