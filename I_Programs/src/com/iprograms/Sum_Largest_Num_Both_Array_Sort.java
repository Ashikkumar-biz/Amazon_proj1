package com.iprograms;

import java.util.Arrays;

//input int a[] = {1,2,5,6,3,2}
//int b[] = {44,66,99,77,33,22,55}
//output = 105
public class Sum_Largest_Num_Both_Array_Sort {
	
	public static void main(String[] args) {
	int array1[] = {1,2,5,6,3,2};
	int array2[] = {44,66,99,77,33,22,55};
	
	//with using sort
	//Arrays.sort(array1);
	//Arrays.sort(array2);
	
	//without using sort
	for(int i=0; i<array1.length-1; i++) {
		for(int j=i+1; j<array1.length; j++) {
			if(array1[i]>array1[j]) {
				int temp = array1[i];
				array1[i]=array1[j];
				array1[j]=temp;
		}
		}
	}
	for(int i=0; i<array2.length-1; i++) {
		for(int j=i+1; j<array2.length; j++) {
			if(array2[i]>array2[j]) {
				int temp = array2[i];
				array2[i]=array2[j];
				array2[j]=temp;
		}
		}
	}
	System.out.println(Arrays.toString(array2));
	int sum = array1[array1.length-1]+array2[array2.length-1];
	System.out.println(sum);
	}
}