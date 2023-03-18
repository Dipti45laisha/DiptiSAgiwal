package com.stringdemo;
import java.util.Scanner;
public class Reverseword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse Word");
		String str=sc.nextLine();
		//Stringoperat p=new Stringoperat();
		//p.reverse1(str);
		String str1="";
		String[]a=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			str1=str1+a[i]+" ";
			
		}
		System.out.println('"'+str1.trim()+'"');

		}
	
}
