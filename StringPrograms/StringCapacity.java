/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPrograms;

/**
 *
 * @author 91984
 */
public class StringCapacity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer sb=new StringBuffer("Hello");//16+5=21
        sb.ensureCapacity(90);
        System.out.println(sb.capacity());
        sb.append("Java111111111111111111");//exceeds next 16 so(21*2)+2=44
        System.out.println(sb.capacity());
        sb.append("a999999999999999999");
        System.out.println(sb.capacity());
    }
    
}
