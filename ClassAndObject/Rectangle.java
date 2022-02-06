/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Rectangle1 {
    //Implement your code here    
    float length;
    float width;
    public float area(float l,float w)
    {
        float area=l*w;
        return area;
    }
    public float peri(float l,float w)
    {
        float peri=2*(l+w);
        return peri;
    }
}

class Rectangle {

	public static void main(String args[]) {
		
		Rectangle1 r=new Rectangle1();
		//Assign values to the member variables of Rectangle class
                 r.length=12f;
                 r.width=5f;
        //Invoke the methods of the Rectangle class to car.lengthlculate the area and perimeter
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is "+r.area(12f,5f));
		System.out.println("Perimeter of the rectangle is "+r.peri(r.length,r.width));
	}

}