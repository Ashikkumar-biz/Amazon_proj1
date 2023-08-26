package com.interviewPrograms;

public class CountRepeatedNumbers {
	public static void main(String[] args) {
	int[] num={1,2,1,2,3,4,5,6,6};
    int[] num2=new int[num.length];
    
    for (int i=0;  i<num.length; i++)
    {
      int count =1 ;
      for (int j=i+1; j<num.length; j++)
      {
        
        if(num[i]==num[j])
        {
        count++;
        num2[j]=-1;
       }
        if(num2[j]!=-1){
          num2[j] = 1;
        }
      }
        if(count!=1)
        {
          num2[i]=count;
        }
        
          
       
   }
   
   for (int g =0;g<num.length; g++)
   {
     if (num2[g]!=-1){
     System.out.println(num[g]+" "+num2[g]+"times");
   }
     }
  }
}


