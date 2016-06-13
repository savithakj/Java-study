package com.lib.pack;

public class TestPoint {
	private static Point aPoint;

	/**
	 * The main program.
	 *
	 * @param args
	 *            command line arguments (ignored)
	 */
	public static void main(String args[]) {
		System.out.println("Point.soManyPoints = " + Point.soManyPoints());
		aPoint = new Point(2, 3);
		System.out.println("x = " + aPoint.getX());
		System.out.println("y = " + aPoint.getY());

		aPoint = new Point();
		aPoint.initPoint(4, 5);
		System.out.println("x = " + aPoint.getX());
		System.out.println("y = " + aPoint.getY());

		aPoint.move(6, 7);
		System.out.println("x = " + aPoint.getX());
		System.out.println("y = " + aPoint.getY());

		System.out.println("nPoints = " + aPoint.getNPoints());
		System.out.println("aPoint.soManyPoints = " + aPoint.soManyPoints());
	}
}
 class Point {
	// class variable
	static int nPoints; // so many points were created.

	private int x; // x coordinate of the point
	private int y; // y cooridnate of the point

	/**
	 * Default Constructor. Increases the counter nPoints by 1.
	 *
	 * @return Point a Point object
	 */
	public Point() {
		super();
		System.out.println(" in Point() constructor");
		nPoints++;
	}

	/**
	 * Constructor.
	 * initialize x and y values of a point
	 *
	 * @param x x coordinate
	 * @param y y coordinate
	 *
	 * @return Point a Point object
	 */
	 public Point(int x, int y){
		 super();
		 int i ;
	
	 this.x = x;
	 this.y = y;
	 System.out.println(" in Point(int, int) constructor");
	 }

	public static int soManyPoints() {
		return nPoints;
	}

	public Point initPoint(int x, int y) {
		System.out.println(" in initPoint(int, int)");

		this.x = x;
		this.y = y;

		return this;
	}

	public Point move(int x, int y) {
		System.out.println(" in move(int, int)");

		this.x += x;
		this.y += y;

		return this;
	}

	public int getX() {
		System.out.println(" in getX()");
		return this.x;
	}

	public int getY() {
		System.out.println(" in getY()");
		return this.y;
	}

	public int getNPoints() {
		System.out.println(" in getNPoints()");
		return this.nPoints;
	}
}
