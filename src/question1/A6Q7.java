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
        int[] numbers = new int[999];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 2;
        }
        //how to mark a number in an array
        int p = 2;

        for (int i = 0; i < numbers.length; i++) {
            int multiplier = i * p;
            if (numbers[i] == multiplier) {
            }
        }
    }
}
