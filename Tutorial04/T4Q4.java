/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial04;

/**
 *
 * @author DELL
 */
//Write the statements that display the string in reverse order. (use String.length() to get
//the length of the string)
import java.util.Scanner;
public class T4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       int len=s1.length();
       for(int i=len-1;i>=0;i--){
           
           System.out.print(s1.charAt(i));
       }
       
    }
    
}
