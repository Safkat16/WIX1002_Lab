/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

/**
 *
 * @author DELL
 */
//Write a program that convert the temperature in degree Fahrenheit to degree Celsius.
//The program will display the degree Celsius in two decimal places.
//Celsius = (Fahrenheit – 32) / 1.8
import java.util.Scanner;
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature in Fehrenheit");
        double fehrenheit=sc.nextDouble();
        double celcius=(fehrenheit-32)/1.8;
         System.out.printf("%.2f%n",celcius);
        
      
    }
    
}
