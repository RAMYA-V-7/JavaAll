/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
class reveachword {
    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
	    String words[]=str.split(" ");
            String revstr=" ";
           
            for(int i=0;i<words.length;i++)
            {
                String word=words[i];
                 String rev="";
                for(int j=word.length()-1;j>=0;j--)
                {
                    rev=rev+word.charAt(j);
                }
                revstr=revstr+rev+" ";
            }
            
            return revstr;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}