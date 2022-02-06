/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class AscOrde {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];//Array declaration
        int temp=0;
        for(int i=0;i<n;i++)//Get ele from user
        {
            a1[i]=obj.nextInt();
        }
        System.out.print("Original array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a1[i]+" ");
        }
        //Another sort
        Arrays.sort(a1);
        System.out.print(Arrays.toString(a1));
        //Performing sort
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a1[i]>a1[j])
                {
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
            }
        }
        //Sorted array
        System.out.print("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a1[i]+" ");
        }
        //Sort subarray
        System.out.print("Sorted subarray");
        int a2[]={1,56,9,-9,8,-6,7};
        Arrays.sort(a2,0,5);//last index is left
        for(int i=0;i<a2.length;i++)
        {
            System.out.print(a2[i]+" ");
        }
    }
    
}
