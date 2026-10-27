/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author DELL
 */

//Cramer’s rule is used to solve the linear equations.
//ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
//Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x
//and y. If ad – bc is equal to 0. Display "The equation has no solution"
import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double d=sc.nextDouble();
    double e=sc.nextDouble();
    double f=sc.nextDouble();
    double denominator=(a*d-b*c);
    double threshold=0.00000001;
    if(denominator<threshold){
        System.out.println("No Solution");
    
}
   else {
    double x = (e * d - b * f) / denominator;
    double y = (a * f - e * c) / denominator;
    System.out.printf("Value of X is: %.2f%n", x);
    System.out.printf("Value of Y is: %.2f%n", y);
}
     
    

    
    
}
}
