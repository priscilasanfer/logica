package hackerrank.thirtyDaysOfCode;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/30-data-types/problem
 */

public class DataType {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        int secondInteger;
        double secondDouble;
        String secondSrting;

        /* Read and save an integer, double, and String to your variables.*/
        secondInteger = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();
        secondSrting = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInteger);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + secondSrting);

        scan.close();
    }
}
