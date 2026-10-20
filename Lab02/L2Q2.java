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
public class L2Q2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Price of the car: ");
        int P=sc.nextInt();
        System.out.print("Please Enter the Downpayment Amount: ");
        int D=sc.nextInt();
        System.out.print("Please Enter the Interest Rate in %: ");
        double R=sc.nextDouble();
        System.out.print("Please Enter the Loan Duration in Year: ");
        int Y=sc.nextInt();
        if(P<=0||D<=0||D>P||R<0||Y<=0){
            System.out.println("Invalid Input,Check Again");
        }
        else{
        double M=(P-D)*(1+R*Y/100)/(Y *12);
        System.out.printf("%.2f%n",M);
        }
        

      
    }
    
}
