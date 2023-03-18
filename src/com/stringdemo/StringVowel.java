package com.stringdemo;

import java.util.Scanner;

public class StringVowel {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Count  Vowels");
		String t=sc.nextLine();
		int count=0;
		Stringoperat p=new Stringoperat();
		for (int i = 0; i <t.length(); i++)
		{
		if(p.isvowel(t.charAt(i)))
		count++;
		}
		 System.out.println(" There are " + count + " Vowels in String " + t);
	}

}
