/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

import java.util.Scanner;

public class CountTotChatInStr {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int count=0;
        String s=obj.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
              count++;
            }
        }
        System.out.print(count);
        
    }
}
