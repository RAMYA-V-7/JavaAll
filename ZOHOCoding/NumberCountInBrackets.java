/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class NumberCountInBrackets {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=obj.nextInt();
        int a[]=new int[n];
        int fr[]=new int[n];
        int visited=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        //for traversing and marking the visited and assiging count 
        for(int i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    fr[j]=visited;
                }
               
            }
             if(fr[i]!=visited)
                {
                    fr[i]=count;
                }
        }
        //print
        for(int i=0;i<n;i++)
        {
            if(fr[i]!=visited && i==0)
            {
                System.out.print(a[i]+"("+fr[i]+")");
                continue;
            }
            if(fr[i]!=visited)
            {
                System.out.print(","+a[i]+"("+fr[i]+")");
            }
        }
    }
    
}
