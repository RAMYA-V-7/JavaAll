/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int VowelCount=0,ConsonantCount=0;
       String s1=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
                VowelCount++;
            }
            else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
            {
                ConsonantCount++;
            }
        }
        System.out.print("VowelCount"+VowelCount);
        System.out.print("ConsonantCount"+ConsonantCount);
    }
    
}
