/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.*;
public class REPLACEBYX
{
public static void main(String[] args)
{
	    Scanner obj = new Scanner(System.in);
            String str="geeksgeeksgeeksforgeeksgeeks";
            String pat="geeks";
            for(int i=0;i<str.length();i++)
            {
                if(str.regionMatches(i,pat,0,str.length()));
                {
                    str=str.replace(pat,"X");
                }
            }
            int i=0;
            char c=str.charAt(0);
            while(str.charAt(i)==c)
            {
                i++;
            }
            str=str.substring(i-1,str.length());
            System.out.println(str);
            int j=i-1;
            c=str.charAt(i-1);
           
                while(str.charAt(j)!=c)
                {
                    str+=str.charAt(j);
                }
                
            }
           
	    /*int t = Integer.parseInt(sc.nextLine);
	    while(t-- != 0){
	        String test = sc.nextLine();
	        String pattern = sc.nextLine();
	        String regex = "("+pattern+")+";
	        test = test.replaceAll(regex,"X");
	        System.out.println(test);
            
            
            String s="ababcdabcdabab";
            String p="ab";
            String r="X";
            if(s.contains(p))
            {
              s=s.replaceAll(p,r);
            }
            int i=0;
            if(i==0)
            {
            char c=s.charAt(i);
            while(s.charAt(i)==c)
            {
                i++;
            }
            s=s.substring(i,s.length());
            System.out.print(r);
	    }
            int j=s.length()-1;
            if(j==s.length()-1)
            {
              char t=s.charAt(j);
              while(s.charAt(j)==t)
              {
                  j--;
              }
              s=s.substring(0,j+1);
              System.out.print(s+r);
            }*/
}

