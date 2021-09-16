package uri.beginner;

import java.util.Locale;
import java.util.Scanner;

/*
https://www.urionlinejudge.com.br/judge/en/problems/view/1009

Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.

Input
The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.

Output
Print the seller's total salary, according to the given example.

 */
public class SalaryWithBonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double sales = sc.nextDouble();

        double salaryTotal = fixedSalary + (sales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n" , salaryTotal);
        sc.close();

    }
}
