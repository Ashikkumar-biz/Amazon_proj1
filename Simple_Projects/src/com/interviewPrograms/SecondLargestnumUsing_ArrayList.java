package com.interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestnumUsing_ArrayList {
	{
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(2,3,4,5,1));
		num.add(6);
		num.add(7);
		int temp;
		for (int i=0; i<num.size();i++)
		{
			for(int j=i+1; j<num.size(); j++)
			{
				if(num.get(i)>num.get(j))
				{
				 temp = num.get(i);
				 num.set(i, num.get(j));
				 num.set(j, temp);
				}
			}
			
		}
		System.out.println("The Second Larget number is "+num.get(1));
		
	}
   

}
