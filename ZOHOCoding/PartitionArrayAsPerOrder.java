/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;
public class PartitionArrayAsPerOrder {
    public static void main(String[] args){
        // TODO code application logic here
        int arr[]={1,2,3,4,5,6,7,8};
        int psize=3,c=1,j=0;
        int porder[]={2,3,1};
        String[] str=new String[porder.length];
        String s="";
        for(int i=0;i<str.length;i++)
        {
            str[i]="";
        }
        for(int i=0;i<arr.length;i++)
        {
            if(c<=psize)
            {
                str[j]+=arr[i]+" ";
                c++;
            }
            else
            {
                j++;
                c=1;
                i--;
            }
        }
        for(String w:str)
        {
            System.out.println(w);
        }
        for(int i=0;i<porder.length;i++)
        {
            System.out.print(str[porder[i]-1]);
        }
    }
}
