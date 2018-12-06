package com.strings;

import java.util.Scanner;

public class Reverse {

	
	public String reverse()
	{
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String sr=sc.nextLine();
		char ar[]=sr.toCharArray();
		for(int i=sr.length()-1;i>=0;i--)
		{
			reverse=reverse+sr.charAt(i);
		}
		return reverse;
	}
	 public static void main(String[] args) {
		 Reverse obj=new Reverse();
		 String result;
		 result=obj.reverse();
		 System.out.println(result);
	}
}
