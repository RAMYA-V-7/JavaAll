/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class DesArrays1Collections {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i]=obj.nextInt();
        }
System.out.println("Array elements in descending order: " +Arrays.sort(a1));
        
    }
    
}
