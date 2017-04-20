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

        //Create a list of 10 numbers
        int mark[] = new int[4];

        //Scan in 10 marks
        System.out.println("Please enter 10 marks.");

        for (int i = 0; i < mark.length; i++) {
            mark[i] = input.nextInt();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        //compare each mark

        for (int i = 0; i < mark.length - 1; i++) {
            int k = i + 1;
            if (mark[i] > mark[k]) {
                int temp = mark[k];
                mark[k] = mark[i];
                mark[i] = temp;

            } else if (mark[i] < mark[k]) {
                System.out.println(mark[i]);
            }
            System.out.println(mark[i]);
        }
    }
}