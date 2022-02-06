/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class NewMain{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        for(int i=0;i<s.length();)
        {
            char a=s.charAt(i);
            while(s.charAt(i)==a)
            {
                i++;
            }
            s=s.substring(i,s.length());
        }
        System.out.println(s);
    }
}
