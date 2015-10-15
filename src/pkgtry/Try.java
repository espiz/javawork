/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;
import java.util.Scanner;
/**
 *
 * @author RWIN ESPOIR
 */
public class Try {
 public static void devidebyzero()
         
 {
    try {
        double a,b,c;
 b=0;
 Scanner in=new Scanner(System.in);
    System.out.println("Enter Nber To Devide:");
 a=in.nextDouble();
 c=a/b;
 System.out.println(c);
     }
   catch(ArithmeticException e) {
       System.out.println(e);
        Scanner in=new Scanner(System.in);
         System.out.println("Enter Nber To Devide:");
    double a=in.nextDouble();
     System.out.println("Enter Dividant:");
    double b=in.nextDouble();
 double c=a/b;
 System.out.println(c);
    }
 }
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
       Try callfunction=new Try();
       callfunction.devidebyzero();
    }
    
}
