//package com.interviewPrograms;
//
//public class HowAreYou {
//	public static void main (String[] args) {
//		String s = "How are You ?";
//		String[] splitWord = s.split(" ");
//		for (int i =0; i<splitWord.length-1; i++) {
//			String single = splitWord[i];
//			Char[] charac = single.toCharArray();
//			
//		}
//	}
//
//}

package com.interviewPrograms;

public class HowAreYou {
    public static void main (String[] args) {
        String s = "How are You ?";
        String[] splitWord = s.split(" ");
        for (int i = 0; i < splitWord.length; i++) {
            String single = splitWord[i];
            char[] charac = single.toCharArray();
            for (int j = charac.length - 1; j >= 0; j--) {
                System.out.print(charac[j]);
            }
            if (i < splitWord.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("?");
    }
}
