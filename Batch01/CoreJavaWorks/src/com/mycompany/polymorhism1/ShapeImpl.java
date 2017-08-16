package com.mycompany.polymorhism1;

abstract class Shape{
	public abstract void area();
}

class Rectangle extends Shape{

	@Override
	public void area() {
		System.out.println("Area of Rectangle is l x b ");
	}
	
}

class Square extends Shape{

	@Override
	public void area() {
		System.out.println("Area of square is l x l ");
	}
	
}

public class ShapeImpl {
	
	public void showShape(Shape [] shapes){
		for(Shape temp : shapes){
			temp.area();
		}
	}
	
	public static void main(String[] args) {
		Shape [] shapes = new Shape[4];
		
		shapes[0] = new Rectangle();
		shapes[1] = new Square();
		shapes[2] = new Rectangle();
		shapes[3] = new Square();
		
		new ShapeImpl().showShape(shapes);;
		
	}
}
