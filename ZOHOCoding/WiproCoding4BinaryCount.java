/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
import java.util.*;
class Solution
{
    public static void main (String[]args)
    {
        
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int[] b=new int[n];
        int[] s=new int[n];
        int[] s1=new int[n];
        int i=0,j=0,i1=0,i2=0;
        int max,c0=0,c1=0;
       for(i=0;i<n;i++)
        {
            while(a[j]==a[i])//keep one as const and compare
            {
             i++;
            }
            if(a[j]!=a[i])
                break;
        }
        for(j=i;j<n;j++)
        {
            s[i2++]=a[j];
        }
        int m;
        int l=i2-1;
        for( m=i2-1;m>=0;m--)
        {
            if(a[l]==a[m])
            {
                m--;
            }
            if(a[l]!=a[m])
                break;
        }
        for(j=0;j<m;j++)
        {
            s1[i1++]=a[j];
        }
        for(int k=i1;k>=0;k--)
       {
           if(s[k]==0)
               c0++;
           else
               c1++;
       }
        if(c1>c0)
            max=c1;
        else
            max=c0;
            System.out.println(max);


 }
}       /*''
  char c=s.charAt(n-1);
        int i=n-1;
        while(s.charAt(i)==c)
        {
            i--;
        }
        s=s.substring(0,i+1);
         i=0;
        c=s.charAt(0);
        while(s.charAt(i)==c)
        {
            i++;
        }
        s=s.substring(i);
        for( i=0;i<s.length();i++)
        {
            if(s.charAt(i)-48==0)
                c0++;
            else
                c1++;
        }
        if(c1>c0)
            max=c1;
        else
            max=c0;
        System.out.println(max);









































public class WiproCoding4BinaryCount {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length of the binary string:");
        int n=obj.nextInt();
        int[] a=new int[n];


























for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=n-1;i>0;)
        {
         while(i==a[n-1])
         {
             i=i-1;
         }
         String a1=a.toString().substring(0,i+1);
        }
        for(int i=0;i<n;)
        {
            while(i==a[i])
            {
                i=i+1;
            }
           String a1=a.toString().substring(i);
        }
         
         char[] a2=a1.toCharArray();
         int oneCount=0,zeroCount=0,max;
         
         for(int j=0;j<a2.length;j++)
         {
             if(a2[i]==0)
             {
                 zeroCount++;
             }
             else
             {
                 oneCount++;
             }
         }
         
         if(zeroCount>oneCount)
             max=zeroCount;
         else 
             max=oneCount;
         
         System.out.println("Maximum length:"+max);
            }
        }
   
*/