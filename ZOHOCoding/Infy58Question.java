/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class Infy58Question {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int sum=0;
        String s="";
        for(int i=0;i<n;i++)
        {
            if(a[i]==5)
            {
            do
            {
                s=s+a[i];
                i++;
            }while(a[i]!=8);
            System.out.println(s+8);
            }
            else if(a[i]!=5)
            {
                sum=sum+a[i];
            }                
        }
        String s1=s+8;
        System.out.println(sum+s1); 
        int num=Integer.parseInt(s1);
        System.out.println(sum+num);
        
        }
    }
    

/*
/*
 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int ind5=-1,ind8=-1,sum=0,res=0;
        int a[]=new int[n];String in="";System.out.println(a.length);
        System.out.println("Enter the array elements:\nNote:Always enter the element 8 after 5");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==5) ind5=i;
            if(a[i]==8) ind8=i;
            
        }
        int ind=0;
        while(ind<ind5)
        {
            sum+=a[ind];
            ind++;
        }
        ind=ind8+1;
        while(ind<a.length)
        {
            sum+=a[ind];
            ind++;
        }
        System.out.println(sum);
        for(int i=ind5;i<=ind8;i++)
        {
            in+=a[i];
        }
        res=Integer.parseInt(in);
        sum+=res;
        System.out.println("B/W 5 & 8 "+res+"\nResult "+sum);
        
    }
    
}
*/

