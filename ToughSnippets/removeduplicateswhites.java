/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class removeduplicateswhites{
    public static void removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        //Add each character of the string into LinkedHashSet   
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
        // print the string after removing duplicate characters   
        for(Character ch : set)   
            System.out.print(ch);   
    }
	
	public static void main(String args[]){
	    String str = "object oriented programming object";
            
	    removeDuplicatesandSpaces(str);
	}
}
