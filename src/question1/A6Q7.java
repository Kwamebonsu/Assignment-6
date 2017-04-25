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
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }

        // Create a variable for prime numbers
        int p = 2;

        // Mark all the multiples of 2 as -1
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > p && numbers[i] % p == 0) {
                numbers[i] = -1;
            }
            //System.out.println(numbers[i]);
        }
        while (p <= numbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                if (p + i != -1 && p + i > 2) {
                    p = p + i;
                    break;
                }
            }
            for (int k = 0; k < numbers.length; k++) {
                if (numbers[k] > p && numbers[k] % p == 0) {
                    numbers[k] = -1;
                }
                System.out.println(numbers[k]);
            }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > p && numbers[i] % p == 0) {
//                numbers[i] = -1;
//            }
//            System.out.println(numbers[i]);
//        }

            if (p >= numbers.length) {
                break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != -1) {
                System.out.println(numbers[i]);
            }
        }

    }
}