/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author bonsk5852
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an array of all the integers between 2 and 1000
        //int[] numbers = new int[999];
        int[] numbers = new int[1001];
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // Create a variable for prime numbers
        int p = 2;

        // Mark al the numbers divisible by variable p as -1, then add 1 to p and repeat
        while (p < 1000) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % p == 0 && numbers[i] != p) {
                    numbers[i] = -1;
                }
            }
            p++;
            // If p is already marked, go to the next number
            while (p == -1) {
                p++;
            }
        }
        // Output the prime numbers
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != -1) {
                System.out.println(numbers[i]);
            }
        }
    }
}