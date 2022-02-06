/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.*;
import java.util.Set;

public class RemoveVowels {
        public String revo(String s)
        {
          Set<Character> v=new HashSet<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!v.contains(c))
            {
                sb.append(c);
            }
        }
        return sb.toString();
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        RemoveVowels c1=new RemoveVowels();
        String s=obj.nextLine();
        System.out.print(c1.revo(s));
      
    
}
}
