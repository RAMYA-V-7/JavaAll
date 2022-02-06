/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class OddNumbersBetweenARange {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the start range:");
        int a=obj.nextInt();
        System.out.println("Enter the end range:");
        int b=obj.nextInt();
        for(int i=a;i<b;i++)
        {
            if(i%2==1 && i==a+1)
            {
                System.out.print(i+",");
                continue;
            }
            if(i%2==1)
            {
                System.out.print(","+i);
            }
            
        }
    }
    
}
