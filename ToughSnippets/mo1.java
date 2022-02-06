/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
public class mo1 {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.evaluate(4, 2.5f);
	}

	public void evaluate(int a, int b) {
		System.out.print("First evaluate method invoked");
		System.out.println(a + b);
	}

	public void evaluate(float a, float b) {
		System.out.print("Second evaluate method invoked");
		System.out.println(a + b);
	}
}
 