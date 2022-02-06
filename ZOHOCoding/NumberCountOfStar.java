/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class NumberCountOfStar {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
        a[i]=obj.nextInt();
          if(a[i]>9)
          {
              System.out.println("Enter one digit number:");
              a[i]=obj.nextInt();
          }
        }
         for(int i=0;i<n;i++)
        {
          System.out.print(i+":");    
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    count++;
                }  
                while(count>0)
                {
                    System.out.print("*");
                    count--;
                }
            }
              System.out.println();
            }
       
        
        
    }
}


