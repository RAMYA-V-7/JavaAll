/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class SmallestEleSwapLargestEleSwap {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a1[]=new int[5];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=obj.nextInt();
        }
        System.out.print("Smallest"+small(a1,a1.length));
        System.out.print("Largest"+large(a1,a1.length));
        
    }
public static int small(int a2[],int l)
{
    int temp;
    for(int i=0;i<l;i++)
    {
        for(int j=i+1;j<l;j++)
        {
            if(a2[i]>a2[j])
            {
                temp=a2[i];
                a2[i]=a2[j];
                a2[j]=temp;
            }
        }
    }
    return a2[0];
}
public static int large(int a3[],int l)
{
    int temp;
    for(int i=0;i<l;i++)
    {
        for(int j=i+1;j<l;j++)
        {
            if(a3[i]>a3[j])
            {
            temp=a3[i];
            a3[i]=a3[j];
            a3[j]=temp;
        }
    }
    
}
    return a3[l-1];
}
}
