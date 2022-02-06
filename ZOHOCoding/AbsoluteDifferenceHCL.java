/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
a)absolute value--->returns the positive value of  the given value.
1.Get the array of size n.
2.Rearrange the array(sort).
3.Get the sum of absolute difference of all adjacent elements is minimized.
*/
package ZOHOCoding;

import java.util.Scanner;

public class AbsoluteDifferenceHCL {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        System.out.println("Enter the array elements:");
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        //Rearrrange (Sort the array elements in ascending order).
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        //Sum of absolute difference of all adjacent elements is minimized.
        for(int i=0;i<n-1;i++)
        {
            sum=sum+(Math.abs(a[i]-a[i+1]));
        }
        System.out.println(sum);
    }   
}
