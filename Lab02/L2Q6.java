/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class L2Q6 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter the amount of water in gram: ");
        int waterGram = sc.nextInt();
        
        Double M = waterGram/1000.0;
        
        System.out.print("Please Enter the inital temperature in Fahrenheit: ");
        Double feh_init = sc.nextDouble();
        System.out.print("Please Enter the final temperature in Fahrenheit: ");
        Double feh_final = sc.nextDouble();
        
        Double temp_change = feh_final-feh_init;
        Double celsius = temp_change / 1.8;
        
        Double energy = M*celsius*4184.0;
        System.out.printf("The energy needed is: %+.6e" , energy);
        
    }
    
}
    

