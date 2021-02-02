package lista.comandosDeSelecao;

import java.util.Scanner;

/**
Aprimore o programa anterior, de modo que ele seja compatível com o caso em que a equação resulta em
uma raíz repetida (∆ = 0) e também com o caso em que a equação resulta em raízes complexas. No primeiro
caso, o seu programa deve imprimir o valor de x1,2 apenas uma vez, seguido pela mensagem “(duas raizes
iguais)”. No segundo caso, o seu programa deve imprimir os valores de x1,2 separados entre parte real r e
parte imaginária k, considerando i =
√
−1, no seguinte formato:
x1 = r + ki, x2 = r - ki
Exemplos:
-- Exemplo 1:
1 4 4
x = -2 (duas raizes iguais)
-- Exemplo 2:
1 0 4
x1 = 0 + 2i, x2 = 0 - 2i
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres numeros que serão os coeficientes de uma equacao do segundo grau: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - ( 4 * a * c);

        if (delta < 0) {
            double aux = - delta;
            double constante = -b / ( 2 * a );
            double parte1 = Math.sqrt(aux) / ( 2 * a );
            double parte2 = - Math.sqrt(aux) /( 2 * a );

            System.out.println("x1: " + constante + " + " + parte1 + "i" + ", x2: "  + constante + " + " + parte2 + "i" );

        } else{
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            if(x1 == x2){
                System.out.println("x = " + x1 +  " (duas raizes iguais)");
            } else {
                System.out.println("x1: " + x1 + ", " + "x2: " + x2);
            }

        }


        sc.close();
    }
}
