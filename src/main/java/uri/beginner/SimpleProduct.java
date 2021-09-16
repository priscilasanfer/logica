package uri.beginner;

import java.util.Locale;
import java.util.Scanner;

/*
https://www.urionlinejudge.com.br/judge/en/problems/view/1004

Read two integer values. After this, calculate the product between them and store the result in a variable named PROD.
Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.
 */
public class SimpleProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("PROD = " + a * b);
        sc.close();

    }
}
