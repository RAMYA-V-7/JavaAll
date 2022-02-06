/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.*;
public class KthSmallestLargest {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int k=obj.nextInt();
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
     System.out.print(k+"th Smallest element in the array is:"+a[k-1]);
         for(int i=0;i<n;i++)
     {
         for(int j=i+1;j<n;j++)
         {
             if(a[i]<a[j])
             {
                 int t=a[i];
                 a[i]=a[j];
                 a[j]=t;
             }
         }
     }
         System.out.print(k+"th largest element in the array is:"+a[k-1]);
        
              
    }
    
}
