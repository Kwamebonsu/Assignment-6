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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Ask the user how many marks they would like to input
        System.out.println("How many marks would you like to enter?");
        int number = input.nextInt();

        // Create a list. Length depends on the number entered by the user
        double mark[] = new double[number];

        // Scan in some marks
        System.out.println("Please enter " + number + " marks.");
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
        // Check whether amount of numbers is even or odd
        if (number % 2 == 0) {
            // If the number is even find the 2 middle positions of the array
            int num1 = (number) / 2;
            int num2 = (number - 1) / 2;
            // Find the average of those 2 positions then output it
            double median = (mark[num1] + mark[num2]) / 2;
            System.out.println("The median is " + median + ".");
        } else if (number % 2 == 1) {
            // If the number is odd, find the middle position then output the value in that position
            int middle = (number - 1) / 2;
            System.out.println("The median is " + mark[middle] + ".");
        }
    }
}
