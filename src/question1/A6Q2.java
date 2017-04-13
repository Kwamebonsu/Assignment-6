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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner called input
        Scanner input = new Scanner(System.in);

        //ask the user how long the list should be
        System.out.println("How many heights are being recorded?");
        int number = input.nextInt();

        //create a list of the heights
        double[] heights = new double[number];

        //create a variable for the total
        double total = 0;

        //enter the specified number of heights
        System.out.println("Please enter " + number + " heights in centimetres.");
        for (int i = 0; i < number; i++) {
            double height = input.nextDouble();
            //add each height to the total
            total = total + height;
        }
        //calculate the average
        double avg = total / number;
        System.out.println("The average height is " + avg + "cm.");

        for (int i = 0; i < number; i++) {
            if (heights[i] > avg) {
                System.out.println(heights[i]);
            }
        }
    }
}
