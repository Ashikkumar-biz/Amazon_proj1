package com.prog;

import java.util.Scanner;

public class Reverse_Sentence_SpaceUnaltered {
	
	public static void main (String[] args) 
	{
		reversedWithSpace("what are you doing");
	}
	
	public static void reversedWithSpace(String str) 
	{
		char[] inputArray = str.toCharArray();
		char[] outputArray = new char[inputArray.length];
		
		for (int i=0;i<inputArray.length; i++) {
			if (inputArray[i]==' ') {
				outputArray[i]=' ';
			}
		}
		
		int j=inputArray.length-1;
		for (int i=0; i<inputArray.length; i++) {
			if (inputArray[i]!=' ') {
				if(outputArray[j]==' ') {
					j--;
				}
				outputArray[j] = inputArray[i];
				j--;
			}
			
		}
		
		System.out.println(String.valueOf(outputArray));
	}
	
	
	/*
    static void reverses(String str)
    {
 
        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];
 
        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
 
        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
 
            // Ignore spaces in input string
            if (inputArray[i] != ' ') {
 
                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }
 
    // driver function
    public static void main(String[] args)
    {
        reverses("what are you doing?");
    }
    */
    
}
