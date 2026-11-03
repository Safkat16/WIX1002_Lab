/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

/**
 *
 * @author DELL
 */
public class T4Q2 {
    public static void main(String[] args) {
        //question 1
    int sum=0;
     for(int x=10;x>0;x--){
         sum+=x;
     }
        System.out.println(sum);
    //question 2
    int x=0;
    int y=0;
    do {
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
} while (x < 100);
    
   //question3
   for(int x1 = 1,y1= 20;x1<y1;x1++,y1 -= 2){
    System.out.println(x1+ " " +y1);}
    
    //question4
    int i = 1;
    while(i<=10){
    if (i == 10){
        System.out.println("Program End");
    i++;
}}
    
}}
