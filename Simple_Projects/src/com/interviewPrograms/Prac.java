package com.interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prac 
{
	public static void main (String[] args) 
	{
		String s = "JavaProgram";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0;i<s.length();i++) {
			int count =1;
			if (map.containsKey(s.charAt(i))) 
			{
				map.put(s.charAt(i), count+1);
				
			}
			else 
			{
				map.put(s.charAt(i), 1);
			}
		}
		
			
		}
		

}
