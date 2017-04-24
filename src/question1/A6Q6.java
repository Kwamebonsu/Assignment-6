/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Set the decimal format to 2 decimal places
        DecimalFormat twodp = new DecimalFormat("##.##");
        
        //Get the size of the class from the user
        System.out.println("How many students are in the class?");
        int size = input.nextInt();

        //create a list of numbers. Size depends on the number of students
        double marks[] = new double[size];
        
        System.out.println("Please enter " + marks.length + " marks.");
        //Get the list values from the user
        for (int i = 0; i < size; i++) {
            marks[i] = input.nextDouble();
        }
        
        // Compare each mark to the mark after it. If it is larger, swap the two numbers
        for (int i = 0; i < marks.length - 1; i++) {
            for (int k = i + 1; k < marks.length; k++) {
                if (marks[i] > marks[k]) {
                    double temp = marks[k];
                    marks[k] = marks[i];
                    marks[i] = temp;
                }
            }
        }
        
        //find the total of all the marks and divide it by the number of students
        double total = 0;
        for (int i = 0; i < size; i++) {
            total = total + marks[i];
        }
        double avg = total / size;
        
        System.out.println("");
        
        //output the first number in the array (which should be the lowest)
        System.out.println("The lowest mark in the array is " + marks[0] + " %.");
        
        System.out.println("");
        
        //output the last number in the array (which should be the highest)
        System.out.println("The highest mark in the array is " + marks[marks.length - 1] + " %.");

        System.out.println("");
        
        //output the average mark
        System.out.println("The average mark is " + twodp.format(avg) + " %.");
    }
}