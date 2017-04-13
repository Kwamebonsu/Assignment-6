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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //ask the user for the number of students in the class
        System.out.println("How many students are in the class?");
        int students = input.nextInt();

        //Create a list of numbers the same length as the number of students
        double[] marks = new double[students];

        //create a variable for the sum of all the marks
        double total = 0;

        //ask the user to input the marks
        System.out.println("Please enter the marks.");
        for (int i = 0; i < students; i++) {
            marks[i] = input.nextDouble();
        }
            //add the marks together to find the total
        for (int i = 0; i < students; i++) {
            total = total + marks[i];
        }

        //find the average using the total and the number of students then output the average
        System.out.println("The average is " + total / students + "%!");
    }
}
