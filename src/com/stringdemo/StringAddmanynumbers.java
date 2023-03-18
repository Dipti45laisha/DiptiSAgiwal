package com.stringdemo;

import java.util.Scanner;

public class StringAddmanynumbers {
	public long findsum(String str) {

		int temp=0;
		int sum=0;
		for (int i = 0; i <str.length(); i++)
		{
		//if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			if(Character.isDigit(str.charAt(i)))
				temp=temp*10+(str.charAt(i)-'0');
		   else
		   {
			sum=sum+temp;
			temp=0;
		    }
		}//for loop end
		
			return  sum+temp;
			
		}// method close
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String having digit");
		String t=sc.nextLine();
		sc.close();
		StringAddmanynumbers op=new StringAddmanynumbers();
		System.out.println(op.findsum(t));
		
		
	}
}


