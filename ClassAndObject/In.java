/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Inheri1{
	private String customerId;
	private String customerName;
	public Inheri1(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public Inheri1() {
		System.out.println("Parent Default Constructor");
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println();
	}
}
class RegularCustomer extends Inheri1 {
	private float discount;
	public RegularCustomer(String custId, String custName) {
		this.setCustomerId(custId);
		this.setCustomerName(custName);
		this.discount = 5.0f;
		System.out.println("Child Constructor");
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
}
public class In {
	public static void main(String[] args) {
		RegularCustomer regularCustomer = new RegularCustomer("C1010","Johns Kora");
		regularCustomer.displayCustomerDetails();
	}
}
