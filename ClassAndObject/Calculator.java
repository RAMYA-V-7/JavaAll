/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
/*public class Calculator
{
    int sum=0,r;
    public int sod(int num)
    {
    while(num>0)
    {
        r=num%10;
        sum+=r;
        num=num/10;
    }
    return sum;
    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
        int n=123;
        System.out.print(obj.sod(n));
        
    }
}*/

class Calculator1 {

	// Implement your code here
	public int sod(int n)
	{
 int r,sum=0;
 while(n>0)
 {
     r=n%10;
     sum=sum+r;
     n=n/10;
 }
return sum;
}
}

class Calculator {

	public static void main(String args[]) {

		Calculator1 calculator = new Calculator1();

		// Assign a value to the member variable num of Calculator class
            int n=123;
		// Invoke the method sumOfDigits of Calculator class and display the output
                   System.out.println(calculator.sod(n));
	}
}
