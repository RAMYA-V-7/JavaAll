/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
public class Tester{
	public boolean checkTemp(int temp) {
		if (temp > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Tester tester = new Tester();
		if (tester.checkTemp(110)) {
			System.out.println("Data is valid");
		} else {
			System.out.println("Data is invalid");
		}
	}

    void evaluate(int i, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 