package com.stringdemo;

public class Sample {
//	public static void main(String[] args) {
//		String str="test234";
//		for (int i = 0; i < str.length(); i++) {
//			if(Character.isDigit(str.charAt(i)))
//			{
//				System.out.print(str.charAt(i));
//			}
//		String digit=str.replaceAll("[^0-9]","");
//		System.out.println(digit);
//			
//		}
//		
//	
//	}
public static void main(String[] args) {
	String str="test234";
	for (int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i)))
		{
			System.out.print(str.charAt(i));
		}
	
}

}
}