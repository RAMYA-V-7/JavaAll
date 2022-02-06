/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToughSnippets;
class palinstr{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingl 
            String rev="";
            for(int i=str.length()-1;i>=0;i--)
            {
                rev=rev+str.charAt(i);
            }
            if(str.toUpperCase().equals(rev.toUpperCase()))
                return true;
            else
	    
        return false;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}