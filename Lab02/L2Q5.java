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
public class L2Q5 {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(0,10000+1);
        System.out.println(number);
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
            
        }
        System.out.println(sum);
      
    }
    
}
