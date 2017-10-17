package com.mycompany.day4;

abstract class Figure{
	public abstract void area();
	
	public void draw(){
		System.out.println(" you can draw any figure with pen / pencil ");
	}
}
class Rectangle extends Figure{
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle is found using L X B ");
	}
}
class Circle extends Figure{

	@Override
	public void area() {
		System.out.println("Area of Circle is found is PI * r * r");
	}
	
}
public class FigureImpl {
	public static void main(String[] args) {
		Figure f; 
		f = new Rectangle();
		f.draw();
		f.area();
		
		f = new Circle();
		f.draw();
		f.area();
	}
}
