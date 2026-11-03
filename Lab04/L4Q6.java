/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg04;

/**
 *
 * @author DELL
 */
//. Write a program that generates a non-negative random integer. Display the number of
//digits in the integer.
import java.util.Random;
public class L4Q6 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num=rand.nextInt(0,1234);
        System.out.println(num);
        int count=0;
        while(num>0){
            count++;
           int digit=num%10;
            
           num/=10;
        }
        System.out.println(count);
    }
}
