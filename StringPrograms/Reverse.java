/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // TODO code application logic here
        //APPROACH1
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.print("Reversed string"+rev);
        //APPROACH2----->StringBuilder/Buffer
        String s1=obj.nextLine();
        String s2=obj.nextLine();
        StringBuilder obj1=new StringBuilder(s1);
        obj1.reverse();
        System.out.print(obj1.toString());
        StringBuffer obj2=new StringBuffer(s2);
        obj2.reverse();
        System.out.print(obj2.toString());
    }
    
}
