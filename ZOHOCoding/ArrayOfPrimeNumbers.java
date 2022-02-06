/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class ArrayOfPrimeNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Prime Numbers Are:");
        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(a[i]);
            }
                
        }
    }
    
}
