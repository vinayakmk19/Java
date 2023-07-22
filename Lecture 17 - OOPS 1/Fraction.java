package com.abc;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for (int i = 2; i <= smaller; i++) {
			if (numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}

		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}

//	public void increment() {
//
//		numerator = numerator + denominator;
//		simplify();
//	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		int numerator = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int denominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(numerator, denominator);
		f3.simplify();
		return f3;
	
	}
}
