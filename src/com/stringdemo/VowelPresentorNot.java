package com.stringdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelPresentorNot {
	public static void main(String[] args) {
		//String regex = "[aeiouAEIOU]";
		String s = "cvbnx";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(s);
//		if (matcher.find())
//			System.out.println("Vowel is Present");
//		else
//			System.out.println("Vowel is not Present");
		int f=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println("Vowel is Present");
				f=1;
				break;
				
			}
		}
			
		
			if(f==0)
			{
				System.out.println("Vowel is not Present");
				
			}
			
	}

	}

