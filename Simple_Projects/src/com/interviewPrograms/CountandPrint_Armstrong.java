package com.interviewPrograms;
import java.util.Scanner;
public class CountandPrint_Armstrong {
	
	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter the lower limit: ");
				int lower = input.nextInt();
				System.out.print("Enter the upper limit: ");
				int upper = input.nextInt();

				int count = 0;
				for (int i = lower; i <= upper; i++) {
				    int digits = 0;
				    int result = 0;
				    int temp = i;

				    // count the number of digits in the number
				    while (temp != 0) {
				        digits++;
				        temp /= 10;
				    }

				    // calculate the sum of nth power of each digit
				    temp = i;
				    while (temp != 0) {
				        int remainder = temp % 10;
				        result += Math.pow(remainder, digits);
				        temp /= 10;
				    }

				    // check if the number is Armstrong or not
				    if (result == i) {
				        System.out.println(i + " is an Armstrong number.");
				        count++;
				    }
				}

				System.out.println("Total Armstrong numbers found: " + count);
			}
	    }
	}


