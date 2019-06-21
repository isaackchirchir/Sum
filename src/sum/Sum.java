/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author 19j01acs036
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c;
       
       System.out.println("enter the integer");
       Scanner input= new Scanner(System.in);
       a=input.nextInt();
       b=input.nextInt();
       c=a+b;
       System.out.println("the sum is"+c);
    }
    
}
