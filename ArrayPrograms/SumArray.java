/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//size
        int sum=0;
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=obj.nextInt();
        }
        for(int j=0;j<n;j++){
            sum=sum+a1[j];
        
        }
        System.out.println("The sum of the given array"+sum);
            }
    
}
