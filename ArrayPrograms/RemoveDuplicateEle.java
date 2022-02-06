/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=obj.nextInt();
        }
        Arrays.sort(a1);
        System.out.print("Removing duplicates"+" ");
        int n1=0;
        a1[n1]=a1[0];
        for(int i=0;i<a1.length;i++)
        {
            if (a1[n1]!=a1[i])
            {
                n1++;
                a1[n1]=a1[i];
            }
        }
        for (int i=0;i<=n1;i++ )
        {
            System.out.print(a1[i]+"\t");
        }
        }
}
      