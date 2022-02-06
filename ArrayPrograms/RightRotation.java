/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//How many times array need to be rotataed right
        int a1[]=new int[4];//Array declaration
        for(int i=0;i<a1.length;i++)//Get ele from the user
        {
            a1[i]=obj.nextInt();
        }
        //Original Array
        System.out.print("Original array:");
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }
        //Performing right rotation to the specified no of times
        for(int i=0;i<n;i++)
        {
            int j,last;
            last=a1[a1.length-1];
            for( j=a1.length-1;j>0;j--)
            {
                a1[j]=a1[j-1];
            }
            a1[0]=last;
        }
        //Array after right rotation
        System.out.print("Rotated array:");
        for(int i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+" ");
        }

    }
    
}
