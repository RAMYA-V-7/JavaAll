/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;

/*
Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.
Sample Input and Output

/**
 *
 * @author 91984
 */
public class CatRabbit {
    public static void main(String[] args) {
        // TODO code application logic here
      /*  int legs=500;
        int head=150;
        int  rab=0,chick=0;
        while(legs>0 && head>0)
        {
            if(legs%4==0)
            {
                head--;
                legs=legs-4;
                rab++;
            }
            if(legs%2==0  )
            {
                head--;
                legs=legs-2;
                chick++;
            }
        }
        System.out.println(rab+" "+chick);
        
    }
    
}
*/
Scanner obj=new Scanner(System.in);
        String str=obj.next();
        String num= "";
        String opr= "";
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||str.charAt(i)=='%')
		  opr=opr+str.charAt(i);
           else
		  num=num+str.charAt(i);
        }
        char[] n=num.toCharArray();
        char[] op=opr.toCharArray();
      
        int sum=n[0]-'0',k=0;
 
        for(int j=1;j<n.length;j++)
        {    
           if(op[k]=='+')
               sum=sum+(n[j]-'0');
           else if(op[k]=='-')
               sum=sum-(n[j]-'0');
           else if(op[k]=='*')
               sum=sum*(n[j]-'0');
           else if(op[k]=='/')
               sum=sum/(n[j]-'0');
           else if(op[k]=='%')
               sum=sum%(n[j]-'0');
          k++;
        }
        System.out.println(sum);

    }
    
}