/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;

/**
 *
 * @author 91984
 */
class Employee1 {
    //Implement your code here 
    private int employeeId;
    private String employeeName;
    private double salary;
    Employee1(int e,String em,double s)
    {
        this.employeeId=e;
        this.employeeName=em;
        this.salary=s;
    }
    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(int employeeId)
    {
        this.employeeId=employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName=employeeName;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    */
}


class PermanentEmployee extends Employee1{
      
    //Implement your code her private int empid;e 
   
    private double basicPay;
    private double hra;
    private float experience;
    PermanentEmployee(int empId,String name,double b,double h,float e)
    {
       this.
        this.basicPay=b;
        this.hra=h;
        this.experience=e;
    }
    public double getBasicPay()
    {
        return basicPay;
    }
    public void setBasicPay(double basicPay)
    {
        this.basicPay=basicPay;
    }
    public double getHra()
    {
        return hra;
    }
    public void setHra(double hra)
    {
        this.hra=hra;
    }
    public float getExperience()
    {
        return experience;
    }
    public void setExperience(float experience)
    {
        this.experience=experience;
    }
    public void calculateMonthlySalary()
    {
        this.setSalary=
    }
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    */
}

class ContractEmployee extends Employee {
     
    //Implement your code here 
    private double wage;
    private float hoursWorked;
    ContractEmployee(double w,float h)
    {
        this.wage=w;
        this.hoursWorked=h;
    }
    public double getWage()
    {
        return wage;
    }
    public void setWage(double wage)
    {
        this.wage=wage;
    }
    public float getHoursWorked()
    {
        return hoursWorked;
    }
    public void setHoursWorked(float hoursWorked)
    {
        this.hoursWorked=hoursWorked;
    }
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    */
}

class InAss11{
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
      
}
