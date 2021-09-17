package uri.beginner;
import java.util.Locale;
import java.util.Scanner;

/*

https://www.urionlinejudge.com.br/judge/en/problems/view/1012

Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above, always with a corresponding message (in Portuguese) and one space between the two points and the value.
The value calculated must be presented with 3 digits after the decimal point.
 */

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadraro = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadraro);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
