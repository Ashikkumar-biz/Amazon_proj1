package com.iprograms;

import java.util.HashMap;
import java.util.Map;

//Input = "apple and apple"
//Output = 
//1. Number of words in the given string - 3
//2. Number of Duplicate words in the given String - 1
//3. Position of the Duplicate words in the String - 0,2

public class Duplicate_Words_Count_Index_String {
//1.Number of words in the given string - 3

	public static void main(String[] args) {
	String input = "apple and apple";
	
//	String[] numberOfWords = input.split("\\s+");
//	int length = numberOfWords.length;
	int length = input.split("\\s+").length;
	
	System.out.println("Number of words in the given string - " + length);
	
//2.Number of Duplicate words in the given string - 1
	String lower = input.toLowerCase();
	String[] lowerarray = lower.split("\\s+");
	Map<String,Integer> map = new HashMap<>();
	int count = 1;
	
	for(String word:lowerarray) {
		if(!map.containsKey(word)) {
			map.put(word, count);
			}else {
				count= map.get(word);
				map.put(word, count+1);
			}
		}
	int duplicateCount = 0;
	for (int wordCount : map.values()) {
		if (wordCount > 1) {
			duplicateCount++;
		}
		
	}
	System.out.println("The number of Duplicate words in the given String - "+ duplicateCount);

//3.Position of the Duplicate words in the String - 0, 2		
	Map<String,Integer> mapPosition = new HashMap<>();
	
	for (int i=0; i<lowerarray.length; i++) {
		if(mapPosition.containsKey(lowerarray[i])) {
			int previousPosition = mapPosition.get(lowerarray[i]);
			System.out.println("Position of the Duplicate words in the String is " + (previousPosition)+"," + (i+1));
		}else {
			mapPosition.put(lowerarray[i], i+1);
		}
	}

	}
}
