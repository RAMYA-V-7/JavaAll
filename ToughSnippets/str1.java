/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
class Tester88{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
                str = "He@#$llo!*&";
		String a="";
		String b="";
                String c="[0-9a-zA-Z\\s+]";
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(String.valueOf(ch).matches(c))
		    {
		        a=a+ch;
		    }
		    else{
		        b=b+ch;
		    }
		}
        return (a+b);
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.print(moveSpecialCharacters(str));
	}
	
}
