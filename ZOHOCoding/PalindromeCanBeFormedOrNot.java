/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.*;
public class PalindromeCanBeFormedOrNot {
       public void CanFormPalindromeOrNot(String s)
        {
        ArrayList<Character> obj=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(obj.contains(s.charAt(i)))
            {
                obj.remove((Character)s.charAt(i));
            }
            else
                obj.add((Character)s.charAt(i));
        }
        if(s.length()%2 ==0 && obj.isEmpty() || s.length()%2==1 && obj.size()==1)
           System.out.print(s+" "+"Yes this string has characters of a given string that can be rearranged to form a palindrome."+" ");
        else
            System.out.print("No the character of the given string cannot form a palindrome.");
          }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj2=new Scanner(System.in);
        PalindromeCanBeFormedOrNot obj1=new PalindromeCanBeFormedOrNot();
        String s=obj2.nextLine();
        obj1.CanFormPalindromeOrNot(s);
}
}
