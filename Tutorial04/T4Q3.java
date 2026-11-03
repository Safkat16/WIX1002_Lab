/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

/**
 *
 * @author DELL
 */
//Write the statements that display the first ten values of the Fibonacci sequence. Given
//the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
public class T4Q3 {
    public static void main(String[] args) {
         int f1=1;
         int f2=1;
         int fn=0;
         int n=3;
         System.out.println(f1);
         System.out.println(f2);
         while(n<=10){
             fn=f1+f2;
             System.out.println(fn);
             f1=f2;
             f2=fn;
             n++;
         }
    }
    
}
