/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
class Tester1 {
static int sum=0;
    public static int calculateSumOfEvenNumbers(int[] numbers){
        //Implement your code here and change the return value accordingly
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2==0)
            {
                sum=sum+numbers[i];
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
}