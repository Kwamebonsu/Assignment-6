/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author bonsk5852
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array of all the integers betwenen 2 and 1000
        int[] numbers = new int[999];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }

        // Create a variable for the first prime number
        int p = 2;

        for (int i = 0; i < numbers.length; i++) {
            // P increases by 1 each time
            p = p + i;
            // If P is not marked as -1, multiply it by all the numbers between 2 & 1000
            if (p != -1) {
                for (int k = 2; k < numbers.length / 2 + 1; k++) {
                    // If any of the products are in the array, mark that position as -1
                    for (int q = 0; q < numbers.length; q++) {
                        if (k * p == numbers[q]) {
                            numbers[q] = -1;
                        }
                    }
                }
            }
//            System.out.println(numbers[i]);
        }

        // Output all the prime numbers (Numbers that are not flagged as -1
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != -1) {
                System.out.println(numbers[i]);
            }
        }
    }
}
