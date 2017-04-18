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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Create a list of 10 numbers
        double mark[] = new double[10];

        //Scan in 10 marks
        System.out.println("Please enter 10 marks.");

        for (int i = 0; i < mark.length; i++) {
            mark[i] = input.nextDouble();
        }
        //compare each mark
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] < mark[i + 1]) {
            }
        }
    }
}
