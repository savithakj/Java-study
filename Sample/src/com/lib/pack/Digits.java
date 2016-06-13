package com.lib.pack;
import java.io.*;
import java.util.Scanner;
public class Digits {
	public static void main(String args[])throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
		// Scanner sc=new Scanner(System.in);
		//int input=sc.nextInt();
		//sc.close();
		 int input=Integer.parseInt(br.readLine());
     
	//	Scanner in = new Scanner(System.in);
		//String input = in.nextInt();
		removesymbols(input);
		//int count=counting(input);
		//System.out.println(count1);
	}

	private static void removesymbols(int input) {
		// TODO Auto-generated method stub
		int digit=0;
		int first=input;
		int count=0;
		while(input!=0)
		{
		digit=input%10;
		if(first%digit == 0)
			count++;
		input=input/10;
				
		}
		System.out.println(count);
		
	}

}
