package com.stringdemo;		

import java.util.Scanner;

public class ABCDE {
	   public static void main(String[] args) {
//	     Scanner sc =new Scanner(System.in);
//	     System.out.print("Enter String : "); 
//	     String s = sc.nextLine();  // i love india
		 String s="i love india";
	     String newstr = "";

	     String[] w = s.split(" "); // splitting sentence into word converted to String array

	  for (String str : w) 
	   //  for(String str=0;str<=w.length()-1;str++)
	    {     
	      int length = str.length();
	      String firstchar = str.substring(0, 1);
	      String restchar = str.substring(1, length);
	     
	      newstr = newstr+firstchar.toUpperCase()+restchar+" ";
	    } 
	    System.out.println(newstr); 
	  }
	}