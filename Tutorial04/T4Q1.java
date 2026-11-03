/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial04;

/**
 *
 * @author DELL
 */
import java.util.Random;
import java.util.Scanner;
public class T4Q1 {
    public static void main(String[] args) {
        //a. Find the largest integer n so that n^3 is less than 2000
        int largest=0;
        for(int i=1;i*i*i<2000;i++){
            largest=i;
    }
        System.out.println(largest);
        System.out.println(" ");
    
    
    //Display the square number of the first twelve integers starting from 1.
    for(int j=1;j<=12;j++){
    System.out.println(j*j);
}
    //Display a 4-by-5 matrix using random number within 0 to 100.
    Random rand=new Random();
    int[][] matrix = new int[4][5];
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
         matrix[i][j]=rand.nextInt(0,101);
           System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
    
    // Compute the sum of numbers from 1 to a given number
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    for(int i=0;i<=num;i++){
        sum+=i;
    }
        System.out.println(sum);
        
    //Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places
    double summation=0;
    for(int k=0;k<25;k++){
        summation+=(double)(k+1)/(25-k);
    }
        System.out.printf("%.2f%n",summation);
}
}