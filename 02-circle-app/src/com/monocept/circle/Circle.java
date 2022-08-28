package com.monocept.circle;

public class Circle
{
	private int radius;
	private ColourType colour;
	private BorderType border;
	
	public Circle(int radius, ColourType colour, BorderType border) {
		super();
		this.radius = radius;
		this.colour = colour;
		this.border = border;
	}

	public int getRadius() {
		return radius;
	}

	public ColourType getColour() {
		return colour;
	}

	public BorderType getBorder() {
		return border;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + ", border=" + border + "]";
	}
	
	
	
	
	
}