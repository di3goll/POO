/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catch;

import java.util.Scanner;

/**
 *
 * @author di3go
 */
public class Ejemplo {

    public static void main(String[] args) {

        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number(dividend): ");
        num1 = scan.nextInt();

        System.out.print("Enter second number(divisor): ");
        num2 = scan.nextInt();
        try {
            int div = num1 / num2; 
            System.out.println("Quotient: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Do not enter divisor as zero.");
            System.out.println("Error Message: " + e);
        }

    }
}
