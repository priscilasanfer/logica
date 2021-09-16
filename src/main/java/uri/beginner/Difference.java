package uri.beginner;

import java.util.Locale;
import java.util.Scanner;
/*
https://www.urionlinejudge.com.br/judge/en/problems/view/1007

Read four integer values named A, B, C and D. Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example, with a blank space before and after the equal signal.
 */

public class Difference {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diference = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diference);

        sc.close();
    }
}
