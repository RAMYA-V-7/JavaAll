/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

class rev
{
    int i,temp=0;
    public void rev(int a1[])
    {
          for(int i=0;i<a1.length;i++)
        {
            for(int j=i+1;j<a1.length;j++)
            {
                if(a1[i]<a1[j])
                {
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
            }
        }
    }
}
public class DesArrays {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        rev obj1=new rev();
        
        int n=obj.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=obj.nextInt();
        }
        Arrays.sort(a1);
        obj1.rev(a1);
        System.out.println(Arrays.toString(a1));
    }
    
}
