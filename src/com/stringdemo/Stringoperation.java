package com.stringdemo;

import java.util.Scanner;

public class Stringoperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String containig Digit");
		String str=sc.nextLine();
		int result=0;
		for(int i=0;i<str.length();i++)
		{
//			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
//				result=result+str.charAt(i)-'0';
//			}
			
			if(Character.isDigit(str.charAt(i))) {
		result=result+Character.getNumericValue(str.charAt(i));
			
			}
			
			
			
		}
		System.out.println(result);
		
		
		}
}
