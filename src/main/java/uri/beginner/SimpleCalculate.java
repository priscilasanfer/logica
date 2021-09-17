package uri.beginner;

/*
https://www.urionlinejudge.com.br/judge/en/problems/view/1010

In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2.
After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol.
The value must be presented with 2 digits after the point.

 */

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int productNumber1 = sc.nextInt();
        int productQuantity1 = sc.nextInt();
        double productAmount1 = sc.nextDouble();
        int productNumber2 = sc.nextInt();
        int productQuantity2 = sc.nextInt();
        double productAmount2 = sc.nextDouble();

        double total = ((productQuantity1 * productAmount1) + (productQuantity2 * productAmount2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
