/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Subject {
	private String subjectName;

	Subject(String subjectName) {
		this.subjectName = subjectName;
	}
           public String getsubname()
    {
        return subjectName;
    }
    public void setsubname(String subjectName)
    {
        this.subjectName=subjectName;
    }
}

class Student {
	private int rollNo;
	private String studentName;
	private Subject subject;

	Student(int rollNo, String studentName, Subject subject) {
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.subject = subject;
	}
 
	public void displayDetails() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject Name: " + subject.getsubname());

		// We cannot directly access the private member of the class Subject
		// To access the private members of aggregated class, we will have to
		// make use of the getter and setter methods

		// Add the getter and setter methods to class Subject and modify the
		// displayDetails method accordingly

	}

	public static void main(String args[]) {
		Subject subject = new Subject("Maths");
		Student student = new Student(101, "Nate", subject);
		student.displayDetails();
	}
}