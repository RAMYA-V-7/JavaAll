/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestEleLargestEle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=obj.nextInt();
        }
        Arrays.sort(a1);
        System.out.print("Smallest ele in the array:"+a1[0]);
        System.out.println("Largest ele in the array:"+a1[n-1]);
        
    }
    
}
