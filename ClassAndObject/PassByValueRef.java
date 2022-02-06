/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
//pass by ref
/*class PassByValueRef1{
    int contactnumber;
    public void updateContact(Customer customer) { 
     customer.contactNumber = 9786758497L; 
}
}
class PassByValueRef{
public static void main(String args[]) { 
	PassByValueRef1 customerOne = new PassByValueRef1(); 
	customerOne.contactNumber = 7656434567L; 
	System.out.println(customerOne.contactNumber); 
	customerOne.
	System.out.println("After calling updateContact method"); 
	System.out.println(customerOne.contactNumber); 
} 
}*/
//pass by value
 class D{
	public void changeValue(int value1, int value2) {
		value1 = value1 + value2;
		value2 = value1 - value2;
		System.out.println(value1 + " " + value2);
	}
}
class PassByValueRef
{
public static void main(String args[]) {
	D demo = new D();
	int x = 20;
	int y = 10;
	System.out.println(x + " " + y);
	demo.changeValue(x, y);
	System.out.println("After calling changeValue function");
	System.out.println(x + " " + y);
}
}