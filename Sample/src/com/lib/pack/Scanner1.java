package com.lib.pack;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("1blobblob2blob3");
		String line = sc.nextLine();
		System.out.printf("-%s-%n", line);
		sc.close();
		sc=sc.useDelimiter("blob");
		//line = sc.nextLine();
		System.out.printf("-%s-%n", line);
		System.out.printf("> ");
		while (sc.hasNext()) {

			//line = sc.nextLine();
			System.out.printf("-%s-%n", line);
			System.out.printf("> ");
		}
		sc.close();
	}
}