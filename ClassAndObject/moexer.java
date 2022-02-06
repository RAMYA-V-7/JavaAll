/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Point {
    //Implement your code here
    private double xCoordinate;
    private double yCoordinate;
    Point(double xCoordinate,double yCoordinate)
    {
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }
    public double getxCoordinate()
    {
        return xCoordinate;
    }
    public void setxCoordinate(double xCoordinate)
    {
        this.xCoordinate=xCoordinate;
    }
    public double getyCoordinate()
    {
        return yCoordinate;
    }
    public void setyCoordinate(double yCoordinate)
    {
        this.yCoordinate=yCoordinate;
    }
    public double calculateDistance()
    {
        double d=(Math.sqrt(Math.pow(xCoordinate,2)+Math.pow(yCoordinate,2)));
        return d;
    }
    public double calculateDistance(Point point)
    {
        double x=xCoordinate-point.xCoordinate;
        double y=yCoordinate-point.yCoordinate;
        double d=(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        return d;
    }
}


class moexer {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6,4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
       System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
