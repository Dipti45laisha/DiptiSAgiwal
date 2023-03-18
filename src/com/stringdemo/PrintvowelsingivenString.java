package com.stringdemo;

public class PrintvowelsingivenString {
	public static void main(String[] args) {
		String str="Leena";
		char[]ch=str.toCharArray();
		String s="AEIOUaeiou";
		char[] ch1=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if(ch[i]==ch1[j])
				{
					System.out.println(ch[i]);
				}
				
			}
			
		}
		
		
	}

}
