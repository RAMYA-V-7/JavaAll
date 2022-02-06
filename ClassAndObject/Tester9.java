/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
/*class Demo11 {
	public int var1 = 20;
	public int var2 = 40;

	Demo11(int v1, int v2) {
		this.var1 = v1;
		this.var2 = v2;
	}
}

public class ConsTryOut {
	public static void main(String args[]) {
		Demo11 demo = new Demo11();
		System.out.println(demo.var1);
		System.out.println(demo.var2);
	}
}
*/
public class Tester9 {
	public int num1;
	public int num2=60;

	Tester9(int num1, int num11) {
		num1 = num1;
		num2 = num11;
	}

	public static void main(String args[]) {
		Tester9 tester = new Tester9(20, 40);
		System.out.println(tester.num1);//obj will print the default value of the constructor if not declared 9 and 77
		System.out.println(tester.num2);
	}
}
/*
class Main {

  String language;

  // constructor with no parameter
  Main() {
    this.language = "Java";
  }

  // constructor with a single parameter
  Main(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) {

    // call constructor with no parameter
    Main obj1 = new Main();

    // call constructor with a single parameter
    Main obj2 = new Main("Python");

    obj1.getName();
    obj2.getName();
  }
} LOCAL PARAMETER HAVE MORE PRIORITY THAN FORMAL
*/