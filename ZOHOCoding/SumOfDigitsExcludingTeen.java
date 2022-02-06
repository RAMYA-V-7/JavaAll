/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class SumOfDigitsExcludingTeen{
    public static int fixTeen(int n)
    {
        if((n>=13 && n<15 )||(n>16 && n<=19))
        {
            return 0;
        }
        else
        {
            return n;
        }
    }
     public static int noTeenSum(int a,int b,int c)
     {
      int sum=fixTeen(a)+fixTeen(b)+fixTeen(c);
      return sum;
     }
      public static void main(String[] args){
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        System.out.println(noTeenSum(a,b,c));
            
        
    }
}
