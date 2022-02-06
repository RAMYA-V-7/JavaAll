/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class INFYModelPattern 
{
    public static int reverse(int num)
    {
        int reverse1;
        int rev=0;
        while(num>0)
        {
            reverse1=num%10;
            rev=(rev*10)+reverse1;
            num=num/10;
        }
        return rev;
    }
public static void main(String[] args) 
{
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int innum=obj.nextInt();
        int innum1;
        do
        {
        innum1=innum+reverse(innum);
         if(innum1==reverse(innum1))
         {
              System.out.println(innum1);
         }
         else
         {
         innum=innum1;
         }
        }while(innum1!=reverse(innum1));
        
}
}
