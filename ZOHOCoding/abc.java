/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] c=s.toCharArray();
        String alpha = "";
        String num="";
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>=97 && c[i]<122)
            {
              alpha=alpha+c[i];
            }
            if(c[i+2]>='0' && c[i+2]<='9')
            {
                num=num+c[i];
            }
        }
        System.out.println(alpha.toCharArray());
        System.out.println(num.toCharArray());
        for(int i=0;i<num.length();)
        {
            System.out.print(alpha);
            i++;        
        }
    }
}
