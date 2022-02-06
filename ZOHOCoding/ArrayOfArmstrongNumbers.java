/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class ArrayOfArmstrongNumbers
{
    public static int arms(int a)
    {
        int a1;
        int sum=0;
        while(a>0)
        {
            a1=a%10;
            sum=sum+(a1*a1*a1);
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Armstrong Numbers are:");
        for(int i=0;i<a.length;i++)
        {
             if(a[i]==arms(a[i]))
             {
                 System.out.println(a[i]);
             }
        }   
    }
}
