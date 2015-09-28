package cpd3314assign3;

import java.util.Scanner;

/**
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class CPD3314Assign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        Scanner in = new Scanner(System.in);
        int choice;
        do {

            System.out.println("Which exercise would you like to run? [1,2,3] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 1:
                    doExercise1();
                    break;
                case 2:
                    doExercise2();
                    break;
                case 3:
                    doExercise3();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #1 - I/O Decisions
     * 
     * 1. Prompt the user for a number between 1-10.
     * 2. Store the number in an integer variable.
     * 3. If the number is over ten, output "That's too high!"
     * 4. If the number is under one, output "That's too low!"
     * 5. If the number is seven, output "Lucky number seven!"
     * 6. Otherwise, output "Thank you!"
     * 
     * SAMPLE EXECUTION (1-10, not 7):
     * Enter a Number Between 1-10:
     * 4
     * Thank you!
     *     
     * SAMPLE EXECUTION (Less than 1):
     * Enter a Number Between 1-10:
     * -4
     * That's too low!
     *     
     * SAMPLE EXECUTION (More than 10):
     * Enter a Number Between 1-10:
     * 14
     * That's too high!
     *     
     * SAMPLE EXECUTION (Seven):
     * Enter a Number Between 1-10:
     * 7
     * Lucky number seven!
     *     
     */
    public static void doExercise1() {
        // TODO: Do Exercise #1 Here
        
    }

    /* Exercise #2 - Nested Logic
     *
     * 1. Prompt the user for a letter and a number.
     * 2. Store the letter in a character variable, and the number as an integer.
     * 3. If the number is greater than or equal to one, and the number is
     *      less than or equal to 26, continue the program. Otherwise, 
     *      output "Please pick a number between 1-26." and end the program.
     * 4. Create two new integer variables called lowerNum and upperNum.
     * 5. Give lowerNum the value of (number + 'a' - 1).
     * 6. Give upperNum the value of (number + 'A' - 1).
     * 7. If lowerNum equals letter, or upperNum equals letter, then output
     *      "That's the right number/letter." Otherwise, output "Try again."
     * 
     * SAMPLE EXECUTION (Good Match)
     * Enter a Letter:
     * d
     * Enter a Number:
     * 4
     * That's the right number/letter.
     * 
     * SAMPLE EXECUTION (Bad Match)
     * Enter a Letter:
     * Y
     * Enter a Number:
     * 4
     * Try again.
     * 
     * SAMPLE EXECUTION (Out of Bounds)
     * Enter a Letter:
     * b
     * Enter a Number:
     * 43
     * Please pick a number between 1-26.
     * 
     */
    public static void doExercise2() {
        // TODO: Do Exercise #2 Here
    }

    /* Exercise #3 - Output Formatting
     *
     * 1. Prompt the user for a price.
     * 2. Store the price as a double variable.
     * 3. Calculate and store the amount of taxes as price * 0.13.
     * 4. Calculate and store the total as price + taxes.
     * 5. Output on one line: "Taxes: $x.xx Total: $y.yy" where $x.xx is the
     *      amount of taxes to two decimal places, and $y.yy is the total
     *      price to two decimal places.
     *
     * SAMPLE EXECUTION:
     * Enter a Price:
     * 14
     * Taxes: $1.82 Total: $15.82
     */
    public static void doExercise3() {
        // TODO: Do Exercise #3 Here
        
    }

}
