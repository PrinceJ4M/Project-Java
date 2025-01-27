
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Prince
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        double result;
        
      
      result = num1 + num2;
      System.out.println("Addition: " +  result);
      
      result = num1 - num2;
      System.out.println("Subtraction: " + result);
      
      result = num1 * num2;
      System.out.println("Multiplication: " + result);
      
      result = num1 / num2;
      System.out.println("Division: " + result);
           
    }
}
