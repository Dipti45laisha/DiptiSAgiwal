package com.stringdemo;
import java.util.Scanner;
public class ReversEeachWordinaString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String for reverse each word in a String Without Changiong Order");
		String s=sc.nextLine();
		String[]word=s.split(" "); //words is name of Array & split each word in String where getting a space stored in Array
		String reversestring="";
		for(String w:word)           //Satrt from First  Word stored in another variable w
		{
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);             //logic of reverse word(String)
			}
			reversestring=reversestring+reverseword+" ";
		}
		System.out.println(reversestring);
	}
}
