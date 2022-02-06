/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class PrintEleOfArrayInEvenAndOddPosition {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];//Declare array
        for(int i=0;i<n;i++)//Get array elements from the user  
        {
            a1[i]=obj.nextInt();
        }
        //Print elements of a1 in odd positions//i=0
        for(int i=0;i<n-1;i=i+2)
        {
            System.out.print(a1[i]);
        }
        //Print elements of a1 in even positions//i=1
        for(int i=1;i<n-1;i=i+2)
        {
            System.out.print(a1[i]);
        }
    }
    
}
