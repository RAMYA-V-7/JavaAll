/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];//Array Declaration(Giving Memory to the array)
        for(int i=0;i<n;i++)//Getting array elements from the user
        {
            a1[i]=obj.nextInt();
        }
        //Printing the array got from the user in thr reverse order
        for(int j=n-1;j>=0;j--)
        {
            System.out.print(a1[j]+" ");
        }
    }
    
}
