/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOHOCoding;

/**
 *
 * @author 91984
 */
class FindingHighestOccurrence {

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		int max1=-1,max2=-1,space=0;
                int[] lower=new int[26];
                int[] upper=new int[26];
		
		char ch[]=str.toCharArray();
		for(int i=0;i<26;i++)
                {lower[i]=0;upper[i]=0;}
		for(int i=0;i<ch.length;i++)
		{
		    if(ch[i]!=' ')
		    {
                        if(ch[i]>='a' && ch[i]<='z')
                            lower[ch[i]-'a']++;
                        if(ch[i]>='A' && ch[i]<='Z')
                            upper[ch[i]-'A']++;
		    }
                    else
                        space++;
		}
		for(int i=0;i<26;i++)
		{
		    if(max1<lower[i])
		       max1=lower[i];
                    if(max2<upper[i])
                        max2=upper[i];
		}
                
        return max1>=max2?(max1>=space?max1:space):(max2>=space?max2:space);
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}