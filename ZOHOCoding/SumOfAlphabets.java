/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class SumOfAlphabets {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int sum=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>=65 && c[i]<=90)//Since they are alphabets we have not given -48
            {
            sum=sum+((int)c[i]-64);//64 is the ascii value to be subtracted from 65 to 90(A TO Z).
            }
            else if(c[i]>=97 && c[i]<=122)
            {
            sum=sum+((int)c[i]-96);//96 is the ascii value to be subtracted from 97 to 122(a to z).
            }  
        }
        System.out.print("Sum of alphabets of-> "+s+" is "+sum);
        
    }
    
}
