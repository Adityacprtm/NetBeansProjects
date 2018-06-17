/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Adityacprtm
 */
public class dfg {
    public static void main(String[] args) {
        int a = 7;
        int b = 5 + a++ * ++a - 2;
        System.out.println(b);
        
        a=7;
        int b1 = 5 + a++ * a++ - 2;
        System.out.println(b1);
        
        int c=2;
        int d=3;
        c *= d;
        System.out.println(c);
        
        int p=16, q=3;
        int h=p+q/(int)2.0;
        System.out.println(h);
    }
    
}
