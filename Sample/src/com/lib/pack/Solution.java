package com.lib.pack;

import java.util.*;

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	int count=sc.nextInt();
    int sum=0;
    int num;
    	while(count>=0)
    	{
    	String a=sc.next();
    	num=Integer.parseInt(a);
    	sum=sum+num;
    	count--;
    	
    }
System.out.println(sum);
    }
}
