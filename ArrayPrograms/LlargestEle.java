/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class LlargestEle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];//Array Declaration
        for(int i=0;i<n;i++)//Get array ele
        {
         a1[i]=obj.nextInt();
        }
        int max=a1[0];
        //Compare max(first element with all the elements of the array
        for(int i=0;i<n;i++)
        {
            if(a1[i]>max)
            {
                max=a1[i];
            }
        }
        System.out.print("Largest element of the array is:"+max);
        
    }
    
}
