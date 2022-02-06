/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.*;

public class PartionArrayIntoTwo {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int a1[]=new int[n];
        int a2[]=new int[n];
        int k1=0,k2=0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        //div array to two
          int pos=obj.nextInt();
          for(int i=0;i<n;i++)
          {
              if(i<pos)
                  a1[k1++]=a[i];
              else
                  a2[k2++]=a[i];
          }
          for(int i=0;i<k1;i++)
          {
              System.out.print(a1[i]+" ");
          }
          System.out.println("**************************");
          for(int i=0;i<k2;i++)
          {
              System.out.print(a2[i]+" ");
          }
   
}
}
