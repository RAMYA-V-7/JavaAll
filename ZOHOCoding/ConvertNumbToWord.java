/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

import java.util.Scanner;


/**
 *
 * @author 91984
 */
public class ConvertNumbToWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        char[] c=s.toCharArray();
        int l=s.length(),i=0;
       if(c.length<=4)
        {
            String[] OneD={"zero","one","two","three","four","five","six","seven","eight","nine"};
            String[] twoD={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            String[] twoD1={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
            String[] threeD={"hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred","nine hundred"};
            String[] fourD={"thousand","two thousand","three thousand","three thousand","four thousand","five thousand","six thousand","seven thousand","eight thousand","nine thousand"};
            while(l>0)
            {
                if(l==1)
                {
                    if(c[i]-48>=0)
                        System.out.print(OneD[c[i]-48]+" ");
                    break;
                }
                
                if(l==2)
                {
                    if(c[i]-48==1 && c[i+1]-48==0)
                    {
                        System.out.print(twoD[c[i]-48-1]+" ");
                       break;
                    }
                    else if(c[i]-48>=2 && c[i]-48<=9 && c[i+1]-48==0)
                    {
                        System.out.print(twoD1[c[i]-48-2]+" ");
                        break;
                    }
                    else if(c[i]-48>=2 && c[i]-48<=9)
                    {
                        System.out.print(twoD1[c[i]-48-2]+" ");
                         l--;
                          i++;
                        System.out.print(" ");
                    }
                    
                }
                if(l==3)
                {
                    
                if(c[i]-48>=1 && c[i+1]-48==0 && c[i+2]-48==0)
                {
                   System.out.print(threeD[c[i]-48-1]); 
                   break;
                } 
                else if(c[i]-48>=1 && c[i+1]-48==0)
                {
                   System.out.print(threeD[c[i]-48-1]); 
                   l--;i++;
                } 
                
                else if(c[i]-48>=1)
                   System.out.print(threeD[c[i]-48-1]); 
                l--;
                i++;
                
                System.out.print(" ");
            }
                
                if(l==4)
                {
                    if(c[i]-48>=1 && c[i+1]-48==0 && c[i+2]-48==0 && c[i+3]-48==0)
                    {
                        System.out.print(fourD[c[i]-48-1]);
                        break;
                    }
                    else if(c[i]-48>=1 && c[i+1]-48==0 && c[i+2]-48==0)
                    {
                        System.out.print(fourD[c[i]-48-1]);
                        l-=2;
                        i+=2;
                }
                else if(c[i]-48>=1 && c[i+1]-48==0 )
                {
                   System.out.print(fourD[c[i]-48-1]); 
                   l--;
                   i++;
                }
                else if(c[i]-48>=1 )
                   System.out.print(fourD[c[i]-48-1]); 
                
                l--;
                i++;
                System.out.print(" ");
                    
                }
               
            }
            
        }
    }
    
}
