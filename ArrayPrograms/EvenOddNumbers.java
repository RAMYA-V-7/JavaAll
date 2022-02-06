/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;
import java.util.Scanner;
public class EvenOddNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=obj.nextInt();
        }
        System.out.print("Even number:");
        for(int i=0;i<n;i++)
        {
            if(a1[i]%2==0)
            {
                System.out.print(a1[i]+" ");
            }
        }
        System.out.print("Odd number");
        for(int i=0;i<n;i++)
        {
            if(a1[i]%2!=0)
            {
                System.out.print(a1[i]+" ");
            }
        }
    }
    
}
