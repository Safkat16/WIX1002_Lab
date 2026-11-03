/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg04;

/**
 *
 * @author DELL
 */
//Write a simple two players dice game. Each player will take turns to roll a dice. The
//first players that reach more than 100 points win the game. If the player rolls a 6, the
//player will score 6 points and has the chance to roll again.

import java.util.Random;
public class L4Q5 {

    public static void main(String[] args) {
        int p1 = 0, p2 = 0, dice, currentPlayer;
        boolean isOneTurn = true;
        while (true) {
            if (Math.max(p1, p2) >= 100) {break;}
            else {
            
            dice = (int) (Math.random() * 6 + 1);
            currentPlayer = isOneTurn ? 1 : 2;
            if (isOneTurn) {
                p1 += dice;
                isOneTurn = dice == 6;
                // if (dice == 6) { isOneTurn = true}
                // else {inOneTurn = false}
            } else {
                p2 += dice;
                isOneTurn = dice != 6;
                // if (dice == 6) { isOneTurn = false}
                // else {inOneTurn == true} 
            }
            System.out.printf("Player %d rolls the dice and gets %d points.%n", currentPlayer, dice);
        
            }
        }
        System.out.printf("Player %d win with %d points!%n", p1 > p2 ? 1: 2, Math.max(p1, p2));
    }
}
            



            
            
       