/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class ArrayOfPalindromes {
    public static int palin(int a)
    {
        int reverse1;
        int rev=0;
        while(a>0)
        {
         reverse1=a%10;
         rev=(rev*10)+reverse1;
         a=a/10;
        }
        return rev;    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("palindromes are--->");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==palin(a[i]))
            {
                System.out.println(a[i]);
            }
        }   
    }
}
