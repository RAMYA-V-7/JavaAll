/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.*;
public class ZeckendorfTheorem 
{
    public static int fib(int n)
    {
        if((n==0)||(n==1))
        {
            return n;
        }
        int f1=0,f2=1,f3=1;
        while(f3<=n)
        {
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
        return f2;
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //find largest fibo before n
        //subtract it from n and find next largest fibo before n
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(n>0)
        {
            int f=fib(n);
            System.out.print(f+"+");
            n=n-f;
        }
    }
}
          