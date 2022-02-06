/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.*;
public class ExpCalc {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String c=obj.nextLine();
        char[] s=c.toCharArray();
        int l=0,k=0;
        for(int i=0;i<s.length;i++)
        {
        if(s[i]>='0' && s[i]<='9')
        {
            k=k+1;//count of number
        }
        else
        {
            
        }
        }
 int b=s[0]-'0';
 for(int i=1;i<k;i++)
 {
    if(l=='+')
        b+=s[i];
    else if(l=='-')
        b-=s[i];
    else if(l=='*')
        b*=s[i];
    else if(l=='/')
        b/=s[i];
 }
 System.out.println(b);
    }
}

/*
public class ExpCalc {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        l->no of operators
        k->count of numbers
        j,d->in case of abnormal condition
        b,c1->to store frst and second element
           
        Scanner obj=new Scanner(System.in);
        String c=obj.nextLine();
        char[] s=c.toCharArray();
 int l=0,k=0,d=1,j=0;
 for(int i=0;i<s.length;i++)
 {
     if(s[i]>='0' && s[i]<='9')//ascii value between 0 9
     {
         if(l==0)
         {
             k++;
         }
         else
         {
             j=1;
             break;
         }
      }
     else
     {
         l++;
     }
 }
 if(k!=l+1 || j==1)
 {
     System.out.println("Wrong Input");
 }
 else
 {
 int b=s[0]-48;
 l=0;
 for(int i=1;i<k;i++)
 {
     int c1=s[i]-48;
     switch(s[k+l])
     {
         case '+':
             b=b+c1;
             break;
         case '-':
             b=b-c1;
             break;
         case '*':
             b=b*c1;
             break;
         case '/':
             if(c1==0)
             {
                 System.out.println("Abnormal condition");
                 d=0;
             }
             b=b/c1;
             break;
     }
             if(d==0)
             {
                 break;
             }
             l++;
     }
 if(d!=0)
 {
     System.out.println(b);
 }
 }
 
 }
}*/
       /* Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] c=s.toCharArray();
        int frstOPe=0;
        for(int i=0;i<c.length;i++)
        {
            if(!Character.isDigit(c[i]))
            {
                frstOPe=i;
                break;
            }
        
        int ans=c[0];//stores frst element of the array
        int op=frstOPe;
        for(int i=1;i<frstOPe;i++)
        {
            if(c[op]=='+')
                ans+=c[i];
            else if(c[op]=='-')
                ans=ans-c[i];
            else if(c[op]=='*')
                ans=ans*c[i];
            else
                ans=ans/c[i];
            op++;
        }
        System.out.print(ans);
    }*/

