package com.shape;

public class Square implements Polygon {
	float side;
	float n = 4;

	public float getSide() {
		return side;
	}

	public void setside(float side) {
		this.side = side;
	}

	@Override
	public void calcArea() {
		System.out.println("area is:" + (side * side));

	}

	@Override
	public void calcPer() {
		System.out.println("perimeter is:" + (n * side));

	}

}
