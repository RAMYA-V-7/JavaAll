/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class ArrangeEleBasedOnSumOfDigits {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        ArrangeEleBasedOnSumOfDigits o=new ArrangeEleBasedOnSumOfDigits();
       
        //sort the array in ascending order
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
          for( int i=0;i<a.length;i++)  //0 1 2 3 
      {  
         int ans=0;    
      for(int j=0;j<a.length;j++)
      {
        
       while(a[i]>0)  
       {
           
      int dig=a[i]%10; 
       ans=ans+dig; 
       a[i]=a[i]/10;
       }
      
    }
      System.out.println(ans); 
     }
        
        
   } 
}
