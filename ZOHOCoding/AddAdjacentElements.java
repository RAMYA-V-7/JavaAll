/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class AddAdjacentElements {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i=i+2)
        {
            sum=a[i]+a[i+1];
            System.out.print(sum+" ");
            sum=0;
        }
    }    
}
