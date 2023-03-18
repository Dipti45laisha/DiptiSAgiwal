package com.stringdemo;

public class Stringoperat {
public String reverse(String s)
{
	String temp="";
	for(int i=s.length()-1;i>=0;i--) 
	{
		char c=s.charAt(i);
		temp=temp+c;
		
	}
	System.out.println(temp);
	return temp;
}
public boolean isvowel(char c)
{	
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	{
		return true;
		
	}else
	{
		return false;
	}
}
	
public void reverse1(String s)
{
	String str1="";
	String[]a=s.split(" ");
	for(int i=a.length-1;i>=0;i--)
	{
		str1=str1+a[i]+" ";
		
	}
	System.out.println(str1);
	
}

}