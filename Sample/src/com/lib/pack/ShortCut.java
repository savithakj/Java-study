package com.lib.pack;

public class ShortCut {

	private boolean testIt(double n) {
		return n != 0.0;
	}

	private double oneDn(double n) {
		return 1.0 / n;
	}

	public static void main(String args[]) {
		double n;
		ShortCut aS = new ShortCut();

		n = 0.5;
		if (aS.testIt(n) && (aS.oneDn(n) > 1))
			System.out.println("1: 1 / n " + 1 / n);

		n = 0;
		if (aS.testIt(n) && (aS.oneDn(n) > 1))
			System.out.println("2: 1 / n " + 1 / n);

		System.out.println("3: 1.0 / 0 = " + 1.0 / 0);

		if ((n == 0) || (n == 1))
			System.out.println("4: ( n == 0 ) || ( n == 1 ) )");

		System.out.println("5. true || false && true: " + true);
		if (4 == (n = 4))
			System.out.println("6. 4 == ( n = 4 )");
	}
}