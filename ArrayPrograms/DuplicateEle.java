/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;
import java.util.Scanner;
public class DuplicateEle {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size
        int a1[]=new int[n];        
        for(int i=0;i<n;i++)//Get array elements
        {
             a1[i]=obj.nextInt();
        }
        //Find duplicate ele by 2 for loops
        for(int i=0;i<n;i++)//fix one ele
        {
            for(int j=i+1;j<n;j++)//compare with each elements in the array
            {
                if(a1[i]==a1[j])
                {
                    System.out.println(a1[j]);
                }
               
            }
           // System.out.print(a1[i]+" ");
        }
       
    
    }
    
    
    
}
