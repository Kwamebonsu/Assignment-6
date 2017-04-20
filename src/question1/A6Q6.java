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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Get the size of the class from the user
        System.out.println("How many students are in the class?");
        int size = input.nextInt();

        //create a list of numbers. Size depends on the number of students
        double marks[] = new double[size];

        //Get the list values from the user
        for (int i = 0; i < size; i++) {
            marks[i] = input.nextDouble();
        }
        //find the total of all the marks and divide it by the number of students
        double total = 0;
        for (int i = 0; i < size; i++) {
            total = total + marks[i];
        }
        double avg = total / size;





        System.out.println("The average mark was " + avg + ".");
    }
}