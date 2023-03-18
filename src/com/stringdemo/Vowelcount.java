package com.stringdemo;

public class Vowelcount {
	public static void main(String[]args)
	{
		String s="hello";
	    int count=0;
	    for(int i=0;i<=s.length()-1;i++)
	    {
	    	char c=s.charAt(i);
	    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'|c=='E'||c=='I'||c=='O'||c=='U')
	    	{
	    		count++;
	    	}
	    	else
	    	continue;
	    }
	    System.out.println("The number of Vowel is:"+count);
		
	}
}
