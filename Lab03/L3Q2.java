/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03;

/**
 *
 * @author DELL
 */
//Generate a random integer within 0 to 5 and display the integer in word.
//e.g:2 is two.
import java.util.Random;
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int num1=rand.nextInt(0,5+1);
        if(num1==0){
            System.out.println(num1+ " is Zero");
        }
        else if(num1==1){
           System.out.println(num1+ " is One");  
        }
        else if(num1==2){
           System.out.println(num1+ " is Two");  
        }
        else if(num1==3){
           System.out.println(num1+ " is Three");  
        }
        else if(num1==4){
           System.out.println(num1+ " is Four");  
        }
        else if(num1==5){
           System.out.println(num1+ " is Five");  
        }
        
        }
    }
    

