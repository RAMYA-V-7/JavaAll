/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Shape {

	// Method to find the area of circle
	public float calculateArea(float radius) {
		return 3.14f * radius * radius;
	}

	// Method to find the area of rectangle
	public float calculateArea(float length, float breadth) {
		return length * breadth;
	}

	// Code another overloaded method to find the area of triangle
}

class MethodOverloading1{

	public static void main(String[] args) {

		Shape shape = new Shape();

		float circleArea = shape.calculateArea(1.7f);
		float rectangleArea = shape.calculateArea(2.5f, 3.4f);

		System.out.println("Area of circle: " + circleArea);
		System.out.println("Area of rectangle: " + rectangleArea);

		// Invoke the method to find the area of triangle
		// Display the area of triangle
	}
}