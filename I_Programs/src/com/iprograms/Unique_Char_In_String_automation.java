package com.iprograms;
//input = "automation"
//output = "uimn"

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Unique_Char_In_String_automation {


	public static void main (String args[]) {
		String input = "automation";
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i=0;i<input.length();i++) {
			int count = 0;
			if(!map.containsKey(input.charAt(i))){
				map.put(input.charAt(i),count+1 );
			}else {
				map.put(input.charAt(i), (map.get(input.charAt(i))+1));
			}
		}
		System.out.println(map);
		System.out.println(map.entrySet());
		
		//first method to print the key which has a value in map =1 
		StringBuilder output = new StringBuilder();
		for(char c : map.keySet()) {
			int value= map.get(c);
			if(value==1) {
				output.append(c+",");
			}
		}
		System.out.println(output.toString());
		
		
		//Second Method to print the key which has a value in map =1
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
		
	}

}
