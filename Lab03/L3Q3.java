/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author DELL
 */

//Write a program that calculates the total commission receives based on the table
//below. The program will accept the sales volume and calculate the commission.
//Display the commission in two decimal places.
//Sales Volume Commission
//Less than or equal to 100 5% of total sales
//Greater than 100 and less than or equal to 500 7.5% of total sales
//Greater than 500 and less than or equal to 1000 10% of total sales
//Greater than 1000 12.5% of total sales
import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    double rate;
    System.out.print("Please Enter Sales Volume:");
    double sales_vol=sc.nextDouble();
    if(sales_vol<=100){
    rate=.05;
}
    else if(sales_vol<=500){
    rate=.075;
}
    else if(sales_vol<=1000){
    rate=.10;
}
    else{
    rate=.125;
    }
    double commission=sales_vol*rate;
    System.out.printf("Total commission: %.2f%n", commission);
   
    
}
}


   