/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;
import java.util.StringTokenizer;
public class StringTokenizer1 {
    public static void main(String[] args) {
        // TODO code application logic here
      StringTokenizer st=new StringTokenizer("My/Name/Is/Ramya/Hi","/");
      while(st.hasMoreTokens())
      {
          System.out.println(st.nextToken());
      }
     }  
    }
    