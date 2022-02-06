/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Customer11{
    	public String customerId; 
	public String customerName; 
	public long contactNumber; 
	public String address; 
			
	public Customer11() { 
		System.out.println("Parameterless constructor called"); 
	}
		   
	public Customer11(String cId, String cName,String add,long contact) 
        { 
		System.out.println("Parameterized constructor called"); 
		customerId = cId; 
		customerName = cName; 
		contactNumber = contact; 
		address = add; 
	} 
} 

class ConstructorOverloading{
	public static void main(String args[]) { 
	    //the below line will lead to an error as there is no default constructor
        Customer11 customer2 = new Customer11(); 	
        //if a parameterized constructor is created in a class, java doesn't create a default constructor
        //uncomment the parameterless constructor and then execute the code
        
        //the below code leads to an error as the parameters accepted by the constructor does not match the parameters passed
        Customer11 customer1 = new Customer11("C103", "Jacob", "13th Street, New York", 5648394590L); 
		//the order and type of the parameters passed for a parameterized constructor should match the definition properly
		
    } 
}