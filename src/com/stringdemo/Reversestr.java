package com.stringdemo;

import java.util.Scanner;

public class Reversestr {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter the String Which We have to Reverse");
		//String str = sc.nextLine();
		String str="Madam";
		String temp = "";
		if (str.isEmpty())

			System.out.println("String is Empty");
		else {
			for (int i = str.length() - 1; i >= 0; i--) {
				char c = str.charAt(i);
				temp = temp + c;
			}
			System.out.println("Reverse String is:" + " " + temp);
		}
		//sc.close();
	}

}
