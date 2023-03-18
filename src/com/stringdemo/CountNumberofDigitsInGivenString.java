package com.stringdemo;

public class CountNumberofDigitsInGivenString {
	public static void main(String[] args) {
		int count = 0;
		String str = "fgnsdhg674765mngjdh985675";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {

				count++;
			}
		}
		System.out.println("There are :"+count+" "+ "Digits are Present");

	}
}
