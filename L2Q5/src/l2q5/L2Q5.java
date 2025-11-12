/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author User
 */
import java.util.Random;
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        
        int number = rand.nextInt(10001);
        System.out.println("The number is " + number);
        
        int sum = 0;
        int q = number;
        if (q != 0) {
            int d1 = q % 10;
            int d2 = (q % 100 - d1) / 10;
            int d3 = (q % 1000 - d2 - d1) / 100;
            int d4 = (q % 10000 - d3 - d2 - d1) / 1000;
            int d5 = q / 10000;
            sum = d1 + d2 + d3 + d4 + d5;
        } 
        
        System.out.println("Sum of digits is " + sum);
        }
    }
    

