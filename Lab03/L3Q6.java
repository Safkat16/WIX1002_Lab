/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author DELL
 */
//Write a program that asks users to enter the radius of a circle and a coordinate point
//(x, y). Determine whether the point is inside or outside the circle centered at (0, 0).
import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Please Enter Radius:");
    double radius=sc.nextDouble();
    System.out.print("Please Enter Abscissa Value:");
    double abscissa=sc.nextDouble();
    System.out.print("Please Enter Ordinate Value:");
    double ordinate=sc.nextDouble();
    double distance=Math.sqrt(abscissa*abscissa+ordinate*ordinate);
    if(distance<radius){
        System.out.println("The Point is inside the Circle");
    }
    if(distance>radius){
        System.out.println("The Point is Outside the Circle");
    }
    if(distance==radius){
        System.out.println("The Point is on the Circle");
    }
    
    
    
}
}