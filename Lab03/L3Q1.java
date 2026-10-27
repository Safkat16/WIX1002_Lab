/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author DELL
 */
//Write a program that stimulates a simple calculator. It reads two integers and a
//character. If the character is a +, the sum is printed; if it is a -, the difference is
//printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
//it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
import java.util.*;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        System.out.print("Please Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter second integer: ");
        int num2 = input.nextInt();

     
        System.out.print("Please Enter an operator (+, -, *, /, %): ");

        String operatorInput = input.next();

        char operator = operatorInput.charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
    
    

