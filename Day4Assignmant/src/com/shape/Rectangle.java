package com.shape;

public class Rectangle implements Polygon {
	float length;
	float breadth;
	float i = 2;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;

	}

	public float getBreadth() {
		return breadth;

	}

	public float setBreadth(float breadth) {
		return breadth;
	}

	@Override
	public void calcArea() {
		System.out.println("area is:" + (length * breadth));

	}

	@Override
	public void calcPer() {
		System.out.println("perimeter:" + (i * length + i * breadth));

	}
}