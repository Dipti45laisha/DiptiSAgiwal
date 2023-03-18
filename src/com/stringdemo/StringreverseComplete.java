package com.stringdemo;

import java.util.Scanner;

public class StringreverseComplete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse Word");
		String str=sc.nextLine();
		String str1="";
				for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			str1=str1+c;
			
		}
		System.out.println(str1);
	}
}



