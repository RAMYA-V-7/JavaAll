/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class SumOfOddPositionElementsInAnArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
        //add adj ele
        
    }
    
}
