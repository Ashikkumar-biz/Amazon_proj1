package com.iprograms;

//To find the capital letters in a string

public class Capital_Letters_In_String_All_Ways {
	public static void main (String args[]) {
		
		// First way by using isUpperCase Method
		String input = "How Are You ?";
		StringBuilder output = new StringBuilder();
		for(int i=0; i<input.length();i++) {
			char c = input.charAt(i);
			if(Character.isUpperCase(c)) {
				output.append(c);
				System.out.println("Capital letters are "+c );
			}
		}
		System.out.println("The Capital Letters are "+output.toString());

		//Second Way to find the no of capital letters in a string
		for (int i=0; i<input.length(); i++) {
			char b = input.charAt(i);
			if(b >= 'A' && b<='Z') {
				System.out.println(b);
			}
		}
		
		
		//Third way to find the no of capital letters in a string using ASCII Value
		//This is the way to find the ASCII value of a Character using downcasting
				int temp = (int) 'Z';
				System.out.println(temp);
				//ends here A=65, Z=90
		for(int i=0; i<input.length();i++) { 
			char ch = input.charAt(i);
			if(isCapitalLetter(ch)) {
				System.out.println("The Capital Letters are "+ ch);
			}
		}
	}
		public static boolean isCapitalLetter(char cha){
			int asciiValue = (int) cha;
			if(asciiValue>=65 && asciiValue<=90) {
				return true;
			}else {
				return false;
			}
		}
}




