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
public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number of seconds: ");
        int seconds=sc.nextInt();
        int hours=seconds/3600;
        int remaining_sec=seconds%3600;
        int min=remaining_sec/60;
        int sec=remaining_sec%60;
        System.out.println(hours);
        System.out.println(min);
        System.out.println(seconds + " seconds is " + hours + " hours " + min + " minutes " + sec + " seconds");

        
    }
    
}
