package com.stringdemo;

import java.util.Scanner;

public class ADDnumberString {
	public static void main(String[] args) {
		String empty="";
		int w=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String having Digits");
		String original=sc.nextLine();
		char[]wrd=original.toCharArray();
		for (int i = 0; i <original.length(); i++) {
			if(Character.isDigit(wrd[i]))
			{
				empty=empty+wrd[i];
				if(i==original.length()-1)
				{
					int parseInt=Integer.parseInt(empty);
					w+=parseInt;
				}
			}else
				{
					if(empty!="")
					{
						int parseInt=Integer.parseInt(empty);
						w+=parseInt;
						empty="";
						
					}
				}
			}
			System.out.println(w);	
		}
		
	}


