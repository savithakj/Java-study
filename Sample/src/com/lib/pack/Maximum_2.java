package com.lib.pack;




/**
 * Find the maximum of two numbers.
 *
 *@version $Id$
 *
 *@author Hpb
 *
 *Revisions:
 * $Log$
 */

public class Maximum_2 {
 public static double maximum(double _first, double _second ) {
 double max;
 //find maximum
 if ( _first > _second )
 max= _first;
 else
 max= _second;
 return max;
 }

 private double minimum(double _first, double _second ) {
 double minimum;
 //find minimum
 if ( _first < _second )
 minimum = _first;
 else
 minimum = _second;
 return minimum;
 }

 public static void main( String args[] ) {
 Maximum_2 aMaximum_2 = new Maximum_2();
 double firstN = 42.0;
 double secondN = 666.0;

 System.out.println("Maximum(" + firstN + ", " + secondN + ") = " + Maximum_2.maximum( firstN, secondN) );

 System.out.println("Minimum(" + firstN + ", " + secondN + ") = " + aMaximum_2.minimum( firstN, secondN) );
 }
 }