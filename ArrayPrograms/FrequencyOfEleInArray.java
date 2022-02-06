/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPrograms;

import java.util.Scanner;

public class FrequencyOfEleInArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();//Size of the array
        int a1[]=new int[n];//Declare the array
        for(int i=0;i<n;i++)//Get the array from the user
        {
           a1[i]=obj.nextInt();
        }
        int fr[]=new int[n];//FREQUENCY ARRAY->To check the number of times elements occur
        int visited=-1;//MARKS THE END
        for(int i=0;i<n;i++)
        {
         int count=1;//First times the element occurred counted as one
         for(int j=i+1;j<n;j++)//to check first element with the next elements->Whether the elements are equal or not
         {
             if(a1[i]==a1[j])
             {
                 count++;
             fr[j]=visited;//To not check the already checked elements again and again(To avoid counting same element again)
         }
        }
        if(fr[i]!=visited)
        {
            fr[i]=count;
        }
    }
        for(int i=0;i<fr.length;i++)
        {
            if(fr[i]!=visited)
            {
                System.out.println(a1[i]+" Its Frquency Is-> "+fr[i]);//Prints the element and its frequency
            }
        }
    }
}
