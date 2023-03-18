package com.stringdemo;

public class RepeatedCharacter {
	public static void main(String[] args) {
		int count;
		String str="dEePTI";
		String s=str.toLowerCase();
		char ch[]=s.toCharArray();
		System.out.println("Duplicste Chatacter in given String is:");
		for(int i=0;i<=s.length()-1;i++) {
			count=1;
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					//ch[j]='0';
				}
			}
			
			if(count>1 )
				System.out.print(ch[i]);
			
		}
		
		
	}

}
