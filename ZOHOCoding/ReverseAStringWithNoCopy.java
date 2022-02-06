/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class ReverseAStringWithNoCopy {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s1=obj.nextLine();
        char[] s=s1.toCharArray();
        int n=s.length;
        int j=n-1;
        char temp;
        for(int i=0;i<n/2;i++)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(s[i]+"");
        }
    }
    
}
