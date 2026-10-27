/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
//Write a simple two players dice game. Each player will roll the dice twice and the
//player with the highest score wins the game. 
import java.util.Random;
public class L3Q4 {
    public static void main(String[] args) {
        Random rand=new Random();
        int P1_Roll1=rand.nextInt(1,6+1);
        int P2_Roll1=rand.nextInt(1,6+1);
        int P1_Roll2=rand.nextInt(1,6+1);
        int P2_Roll2=rand.nextInt(1,6+1);
        int P1_total=P1_Roll1+P1_Roll2;
        int P2_total=P2_Roll1+P2_Roll2;
        System.out.println("Player 1 Total Score: "+P1_total);
         System.out.println("Player 2 Total Score: "+P2_total);
        if(P1_total>P2_total){
            System.out.println("Player 1 Wins");
        }
        else if(P2_total>P1_total){
            System.out.println("Player 2 Wins");
        }
        else{
            System.out.println("Draw");
        }
        
        
        
    }
    
}
