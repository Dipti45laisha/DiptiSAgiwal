package com.stringdemo;

public class Stringmethodoperation {
	public static void main(String[] args) {
		String a="ANKIT";
		String b="rahul";
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.concat(b));
		System.out.println(a.length());
		String s="   Ankush    ";
		System.out.println(s.trim());
		String d="";
		System.out.println(d.isEmpty());
		
		System.out.println(b.charAt(2));
		System.out.println(b.indexOf('l'));
		d="ANKIT";
		System.out.println(d.equals(a));
		String t="HELLO";
		System.out.println(t.replace('L', 'X'));
		
	}

}
