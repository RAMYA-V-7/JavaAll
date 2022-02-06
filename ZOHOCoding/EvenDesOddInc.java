/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
/*
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 //DES----><  ASC--->>
*/
public class EvenDesOddInc {
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=obj.nextInt();
        int a[]=new int[100];
        int even[]=new int[100];
        int odd[]=new int[100];
        int i=0,j=0;
        int i1=0,j1=0;
        for( i=1;i<=n;i++)
        {
            a[i]=obj.nextInt();
        }
        for( i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even[i1++]=a[i];
            }
            else
            {
                odd[j1++]=a[i];
            }
        }
        for(i=0;i<i1;i++)
        {
            for(j=i+1;j<i1;j++)
            {
                if(even[i]>even[j])
                {
                    int t=even[i];
                    even[i]=even[j];
                    even[j]=t;
                }
            }
        }
        for(i=0;i<j1;i++)
        {
            for( j=i+1;j<j1;j++)
            {
                if(odd[i]<odd[j])
                {
                    int t=odd[i];
                    odd[i]=odd[j];
                    odd[j]=t;
                }
            }
        }
        for( i=0,j=0;i<i1 && j<j1;i++,j++)
        {
            System.out.print(odd[j]+" "+even[i]+" ");
        }
        while(i<i1)
        {
            System.out.print(even[i]+" ");
            i++;
        }
        while(j<j1)
        {
            System.out.print(odd[j]+" ");
            j++;
        }
    
      
  }
}

/*
public class oddNoDesc {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt(),temp=0;int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i+=2)
        {
            for(int j=0;j<n;j+=2)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=1;i<n;i+=2)
        {
            for(int j=1;j<n;j+=2)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int ele:a)
        {
            System.out.print(ele+ " ");
        }
        
    }
    
}
*/
