/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

import java.util.Scanner;

public class ReplaceSpaceWithAnyCharacter {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String s1 = null;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                 s1=s.replace(' ', '?');
            }
        }
        System.out.print(s1);
    }
    
}
