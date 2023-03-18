package com.stringdemo;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be Reverse");
		String s=sc.nextLine();
		Stringoperat p=new Stringoperat();
	//	boolean c=b.isPalindrome(s);
		//System.out.println(" String "+ s +" is Palindrome? "+c);
		String s1 =p.reverse(s);
		//System.out.println(s1);
		
		
		
		
	}

}
