/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterlab;

import java.util.Scanner;
/**
 *
 * @author 147119 Maxwell James Owino
 */
public class Adapterlab {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter temperature in Fahrenheit:");
            double fahrenheit = scanner.nextDouble();

            adapterclass adapter = new adapterclass();
            double celsius = adapter.fahrenheitToCelsius(fahrenheit);
            
            System.out.printf("%.2f Fahrenheit is equivalent to %.2f Celsius.\n", fahrenheit, celsius);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid numeric temperature.");
        } finally {
            scanner.close();
        }
    }
}


