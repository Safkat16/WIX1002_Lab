/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg04;

/**
 *
 * @author DELL
 */
//Write a program that accepts an integer n from user and then sum the following
//series 1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
import java.util.Scanner;
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please the number");
        int num=sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i++){
            int current = 0;
            for(int j = 1; j<=i;j++){
                current += j;
            }
            sum += current;
        }
        System.out.println(sum);
        
        
    }
    
}
