/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg04;

/**
 *
 * @author DELL
 */
//1.1. Write a program that accepts an integer from user. Then, display its entire factors in increasing order
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = input.nextInt();
        if(num<0){
            System.out.println("Invalid Input!Enter a positive number ");
        }
        else{
        
        
        for(int i = 1; i<=num; i++){
            if(num % i ==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
       
            }
        }
        
    
    

