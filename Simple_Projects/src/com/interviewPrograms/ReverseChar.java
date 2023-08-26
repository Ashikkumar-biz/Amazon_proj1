package com.interviewPrograms;

public class ReverseChar {
	public static void main(String[] args) {
		String s = "welcome home dad";
		System.out.println("The correct word is "+ s);
		
		//first method
//		String[] sl = s.split("");
//		ArrayList<Character> ss = new ArrayList<>();
		
		//Second Method
		char[] chr = s.toCharArray();
		//reverse method for 2nd method
		int start = 0;
		int end = chr.length-1;
		while(start<end) {
			char temp = chr[start];
			chr[start] = chr[end];
			chr[end]= temp;
			start++;
			end--;
		}
		
		
		//for loop for 1st method
//		for (int i=sl.length-1; i>=0; i--) {
//			ss.add(sl[i].charAt(0));
//		}
		
		
		//using StringBuilder related to first method
//		StringBuilder sb = new StringBuilder();
//		for (Character c :ss) {
//			sb.append(c);
//		}
//		
//		//realted to first method
//		String reverse = sb.toString();
//		System.out.println(reverse);
		
		//Second method relation
		String sb = new String(chr);
		System.out.println("The reverse word using second method "+sb);
		
		//To print each word reverse
		String[] sl = sb.split(" ");
		String empty = "";
		
		for (int i=sl.length-1; i>=0; i--) {
			empty = empty + sl[i]+" ";
		}
		System.out.println(empty);
		}
	}


