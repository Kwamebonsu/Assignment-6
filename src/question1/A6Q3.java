/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to input two numbers
        System.out.println("Please enter TWO integers.");

        //Create a list of 2 numbers
        int[] integer = new int[2];

        //Scan in 2 numbers
        for (int i = 0; i < 2; i++) {
            integer[i] = input.nextInt();
        }

        //Compare the smaller number and place the smaller one first
        if (integer[0] > integer[1]) {
            System.out.println("The integers in ascending order are: " + integer[1] + ", " + integer[0]);
        }
        if (integer[1] > integer[0]) {
            System.out.println("The integers in ascending order are: " + integer[0] + ", " + integer[1]);
        }

    }
}
