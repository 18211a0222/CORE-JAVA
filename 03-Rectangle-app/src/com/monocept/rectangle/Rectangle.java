package com.monocept.rectangle;
public class Rectangle {
	private double height;
	private double width;
	private ColourType color;
	
	public Rectangle(double height, double width, ColourType color) {
		super();
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public ColourType getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	

}
