package com.nttdata.ta;

public class Calculator {


	public final double SQ_M_PER_SQ_FT = 0.09290304;

	public int area(int length, int width) {
		return length * width;
	}

	public double sqft2sqm(double feet) {
		return feet * SQ_M_PER_SQ_FT;
	}

}
