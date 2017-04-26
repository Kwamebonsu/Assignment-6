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
        // Create an array
        int[] numbers = new int[999];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }


        for (int k = 2; k < numbers.length; k++) {
            int p = numbers[k];
            if (p != -1) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % p == 0) {
                        numbers[i] = -1;
                    }
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != -1) {
                System.out.println(numbers[i]);
            }
        }
    }
}
