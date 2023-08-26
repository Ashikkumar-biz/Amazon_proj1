package com.iprograms;

public class Reverse_Sentence_Preserving_Space {
	public static void main(String args[]) {
		reversedWords("How are doing my dear");
	}
	public static void reversedWords(String input) {
		char[] inputArray = input.toCharArray();
		char[] outputArray = new char[inputArray.length];
		
		for (int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==' ') {
			outputArray[i]=' ';
			}
		}
		System.out.println(outputArray);
		int count = inputArray.length-1;
		for (int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==' ') {
				continue;
			}
			else if (outputArray[count]==' ') {
				count--;
				i--;
			}
			else if (inputArray[i]!=' ') {
				outputArray[count]=inputArray[i];
				count--;
			}
		}
	System.out.println(String.valueOf(outputArray));
	}

}
