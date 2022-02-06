/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

public class OddLeftEvenZeros {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[100];
        int even[]=new int[100];
        int odd[]=new int[100];
        int e1=0,o1=0;
        for(int i=1;i<=n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even[e1++]=a[i];
            }
            else
            {
                odd[o1++]=a[i];
            }
        }
        int countOfEven=0;
        for(int i=0;i<e1;i++)
        {
            countOfEven=countOfEven+1;
        }
        for(int i=0;i<o1;i++)
        {
            System.out.print(odd[i]);
        }
        for(int j=0;j<countOfEven;j++)
        {
            System.out.print("0");
        }
    }
    
}
