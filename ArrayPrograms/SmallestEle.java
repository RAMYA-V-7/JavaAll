/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class SmallestEle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];//Array declaration
        for(int i=0;i<n;i++)//Get array from thr user
        {
            a1[i]=obj.nextInt();
        }
        int min=a1[0];
        //Compare firstelement with all the elements of the array and find the smallest element
        for(int i=0;i<n;i++)
        {
            if(a1[i]<min)
            {
                min=a1[i];
            }
        }
        System.out.print("Smallest element in the array is:"+min);
    }
    
}
//No of elements in array:a1.length;
//Summ of all elements in the array:sum=sum+a1[i];