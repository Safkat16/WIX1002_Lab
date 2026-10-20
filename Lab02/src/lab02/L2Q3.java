/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author DELL
 */
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num1=rand.nextInt(10,50+1);
        int num2=rand.nextInt(10,50+1);
        int num3=rand.nextInt(10,50+1);
        int sum=num1+num2+num3;
        System.out.println(sum);
        double avg=(double)sum/3;
        System.out.printf("%.2f%n",avg);
        


        
        
    }
    
}
