package com.stringdemo;

import java.util.Scanner;

public class Stringmethodnumberadd {


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str="H32llo Te52ll9O";
		int result=0;
		for (int i = 0; i <str.length(); i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				
			}
			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				result=result+str.charAt(i)-'0';
			}
			
		}
		System.out.println(result);
		

	}
	}


