/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a list of 10 numbers
        double mark[] = new double[10];

        // Scan in 10 marks
        System.out.println("Please enter 10 marks.");

        for (int i = 0; i < mark.length; i++) {
            mark[i] = input.nextDouble();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        // Compare each mark to the mark after it. If it is larger, swap the two numbers
        for (int i = 0; i < mark.length - 1; i++) {
            for (int k = i + 1; k < mark.length; k++) {
                if (mark[i] > mark[k]) {
                    double temp = mark[k];
                    mark[k] = mark[i];
                    mark[i] = temp;
                }
            }
        }
        // Output the marks in the array from smallest to largest
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }
    }
}