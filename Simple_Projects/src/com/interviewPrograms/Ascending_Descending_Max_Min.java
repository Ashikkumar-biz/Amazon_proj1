package com.interviewPrograms;
import java.util.Scanner;

public class Ascending_Descending_Max_Min {

	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter the number of elements: ");
				int n = input.nextInt();

				int[] arr = new int[n];
				System.out.println("Enter the elements: ");
				for (int i = 0; i < n; i++) {
				    arr[i] = input.nextInt();
				}

				// find the maximum and minimum numbers
				int max = arr[0];
				int min = arr[0];
				for (int i = 1; i < n; i++) {
				    if (arr[i] > max) {
				        max = arr[i];
				    }
				    if (arr[i] < min) {
				        min = arr[i];
				    }
				}
				System.out.println("Maximum number: " + max);
				System.out.println("Minimum number: " + min);

				// sort the array in ascending order
				int temp;
				for (int i = 0; i < n; i++) {
				    for (int j = i + 1; j < n; j++) {
				        if (arr[i] > arr[j]) {
				            temp = arr[i];
				            arr[i] = arr[j];
				            arr[j] = temp;
				        }
				    }
				}
				System.out.println("Ascending order: ");
				for (int i = 0; i < n; i++) {
				    System.out.print(arr[i] + " ");
				}
				System.out.println();

				// sort the array in descending order
				for (int i = 0; i < n; i++) {
				    for (int j = i + 1; j < n; j++) {
				        if (arr[i] < arr[j]) {
				            temp = arr[i];
				            arr[i] = arr[j];
				            arr[j] = temp;
				        }
				    }
				}
				System.out.println("Descending order: ");
				for (int i = 0; i < n; i++) {
				    System.out.print(arr[i] + " ");
				}
			}
	        System.out.println();
	    }
	}

