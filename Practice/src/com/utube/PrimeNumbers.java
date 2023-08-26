package com.utube;

public class PrimeNumbers {
	
	private static void primeNumber(int num) 
	{
		for(int i=2; i<num; i++) 
		{
			int count = 0;
			for(int j=2; j<i; j++) 
			{
				
				if(i%j == 0) 
				{
					count++;
				}
				
			}
			if (count == 0) 
			{
				System.out.println(i + " ");
			}
		}

	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		primeNumber(100);
	}

}
