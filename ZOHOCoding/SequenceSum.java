/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class SequenceSum {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();
        int j=obj.nextInt();
        int k=obj.nextInt();
        int sum=0;
        //Sequence--->i,i+1,...,j,j-1,j-2,...k.
        for(i=i;i<=j;i++)
        {
         sum+=i;  
        }
        for(j=j-1;j>=k;j--)
        {
         sum+=j;
        }
        System.out.println(sum);
    }
    
}
