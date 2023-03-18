package com.stringdemo;

import java.util.Scanner;

public class StringRepaceCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String original=sc.nextLine();
		System.out.println("Enter the Character Which u Want to Replace");
		char old=sc.nextLine().charAt(0);
		original=original.replace(old,'X');
		System.out.println(original);
		
	}

}
