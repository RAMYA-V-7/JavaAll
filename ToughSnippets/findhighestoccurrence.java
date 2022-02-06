/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;

/**
 *
 * @author 91984
 */

class findhighestoccurrence{

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
	     int a[]=new int[8];
             for(int i=0;i<str.length();i++)
             {
                 a[str.charAt(i)]=a[str.charAt(i)]+1;
             }
             int max=-1;
             int count=0;
             for(int i=0;i<str.length();i++)
             {
                 if(max<a[str.charAt(i)])
                 {
                    /* max=a[str.charAt(i)];
                     c=str.charAt(i);
                          */
                     count++;
                 }
             }
        return count;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
