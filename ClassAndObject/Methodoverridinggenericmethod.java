/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class DynamicBindingTester {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Employee eduEmployee = new Educator();
		Educator managerEdu = new Manager();
		
		displayEmployeeDetails(employee);
		displayEmployeeDetails(manager);
		displayEmployeeDetails(eduEmployee);
		displayEmployeeDetails(managerEdu);
	}
	
	// Employee reference can accept its object and any of the child object 
	public static void displayEmployeeDetails(Employee employee) {
		employee.();	// displayDetails invoked will be based on the object received
	}
}

class Methodoverridinggenericmethod {
	String name = "James Anthony";
	
	public void displayDetails(){
		System.out.println(name+" is an employee");
	}	
}
class Educator extends Employee {
	public void displayDetails(){
		System.out.println(name+" is an educator");
	}
}
class Manager extends Educator {
	public void displayDetails(){
		System.out.println(name+" is a manager");
	}
}
