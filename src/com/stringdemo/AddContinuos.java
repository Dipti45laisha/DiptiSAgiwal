package com.stringdemo;

public class AddContinuos {
	public static void main(String[] args) {
		String str="1stjj45dht52";

		int temp=0;
		int sum = 0;

		for (int i = 0; i <str.length(); i++)
		{
		//if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			if(Character.isDigit(str.charAt(i)))
			{
				temp=temp*10+(str.charAt(i)-'0');
			   
			}
		   else
		   {
			   
			   sum=sum+temp;
			   temp=0;
		   }
		}
		sum=sum+temp;
		System.out.println(sum);
		
	
		

		
	}

}
