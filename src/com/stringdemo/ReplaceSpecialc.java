package com.stringdemo;

import java.util.Scanner;

public class ReplaceSpecialc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the String for replace Special Character");
		//String str=sc.nextLine();
		String str="Te$!ng$h@str@";
		str=str.replaceAll("[@#$%!^&*]","X");
		System.out.println("\""+str+"\"");
		
	}

}
