package com.lib.pack;

import java.util.*;
import java.util.regex.Pattern;

public class ScannerDemo {

	public static void main(String[] args) {

		String s = "1 fish 2 fish red fish blue fish";

		// create a new scanner with the specified String Object
		Scanner scanner = new Scanner(s);
		//  System.out.println("" + scanner.findInLine("fish"));
		System.out.println(""+ scanner.findWithinHorizon(Pattern.compile("..fish.."), 10));
		// print the next line of the string
		System.out.println("" + scanner.nextLine());

		// print the delimiter this scanner is using
		//System.out.println("" + scanner.delimiter());

		// close the scanner
		scanner.close();
	}
}