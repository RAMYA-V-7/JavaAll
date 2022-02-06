/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//How many times array rotate
        int a1[]=new int[3];
        for(int i=0;i<a1.length;i++)
        {
           a1[i]=obj.nextInt();
        }
        System.out.print("Original Array:");
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            int j,first;
            first=a1[0];
            for( j=0;j<a1.length-1;j++)
            {
                a1[j]=a1[j+1];
            }
            a1[j]=first;
        }
        System.out.println("Array after left rotation");
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]+" ");
        }
        
        
    }
    
}
