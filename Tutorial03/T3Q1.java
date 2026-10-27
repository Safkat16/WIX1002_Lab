package tutorial.pkg3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class T3Q1 {
    public static void main(String[] args) {
        int a=3;
        int b=8;
        int multiplication=a*b;
        System.out.println(multiplication==27 ?"3x8 is 27":"3x8 is not 27");
        
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1%2==0 ?"Even Number":"Odd Number");
        char ch = sc.next().charAt(0);

        System.out.println(ch + (Character.isUpperCase(ch) ? " is a capital letter.": " is not a capital letter."));
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        if (s1.compareToIgnoreCase(s2) <= 0) {
            System.out.println(s1 + " " + s2);
        } else {
            System.out.println(s2 + " " + s1);
        }
        
          System.out.print("Enter a number (0-6): ");
        int day = sc.nextInt();

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input.");
        }
        
               
             
        
       
    }
    
}
