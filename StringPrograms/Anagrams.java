/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Two Strings are called the anagram 
if they contain the same characters. 
However, the order or sequence of the characters can be different.
*/
package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        if(s1.length()==s2.length())
        {
          char c1[]=s3.toCharArray();
          char c2[]=s4.toCharArray();
          Arrays.sort(c1);
          Arrays.sort(c2);
          if(Arrays.equals(c1, c2))//Since c1 and c2 are arrays(use sort and equals methods)
          {
              System.out.println("Both the string are anagrams");
          }
          else
              System.out.println("Both the strings are not anagrams");
        }
                }
    
}
