/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        System.out.println("Enter the array elements:");
        int a1[]=new int[n];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=obj.nextInt();
        }
        int a2[]=new int[a1.length];
        for(int i=0;i<a1.length;i++)
        {
            a2[i]=a1[i];
        }
         System.out.println("Elements of a1:");
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
         System.out.println("Elements of a2:");
        for(int i=0;i<a2.length;i++)
        {
            System.out.println(a2[i]);
        }
       //ANOTHER METHOD(USING CLONE
       System.out.println("Elements of a3:");
        for(int i=0;i<a1.length;i++)
        {
            int a3[]=a1.clone();
            System.out.println(a3[i]);
            
        }
        
    }
    
}
