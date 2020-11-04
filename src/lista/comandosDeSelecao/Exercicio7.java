package lista.comandosDeSelecao;
/**
Implemente um programa que calcula as raízes de uma equação do
segundo grau utilizando a fórmula de Bhaskara. O seu programa deve receber como dados de entrada três
números, a, b e c, correspondentes aos coeficientes de uma equação do segundo grau
    aˆ2 + bx + c = 0
e calcular as raízes x1 e x2 de acordo com:
    x1,2 = (−b ±  √ ∆) /  2a
onde ∆ = bˆ2 − 4ac
O seu programa deve imprimir os valores de x1,2 ou a mensagem “Equacao com raizes complexas”, se
∆ < 0. Exemplos:
-- Exemplo 1:
1 3 2
x1 = -1, x2 = -2
-- Exemplo 2:
1 1 -2
x1 = 1, x2 = -2
-- Exemplo 3:
1 4 4
x1 = -2, x2 = -2
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros que serão os coeficientes de uma equacao do segundo grau: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - ( 4 * a * c);

        if (delta < 0) {
            System.out.println("Equacao com raizes complexas”");
        } else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1: " + x1 + ", " + "x2: " + x2);
        }

sc.close();

    }
}
