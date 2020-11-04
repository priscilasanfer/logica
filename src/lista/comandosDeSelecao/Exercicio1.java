package lista.comandosDeSelecao;

/**
Diz-se que um número x é múltiplo de y se o resto da divisão inteira de
x por y for igual a zero. Implemente um programa que recebe como entrada dois números inteiros, x e y. Em
seguida, o seu programa deve imprimir uma mensagem informando se x é múltiplo de y ou não. Exemplo:
-- Exemplo 1:
Insira dois valores
5 2
5 nao e multiplo de 2
-- Exemplo 2:
Insira dois valores
9 3
9 e multiplo de 3
 **/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Primeiro Valor Inteiro: ");
        int x = sc.nextInt();

        System.out.println("Digite o Primeiro Valor Inteiro: ");
        int y = sc.nextInt();

        if(x % y == 0 ) {
            System.out.println( x + " é multiplo de " + y );
        } else{
            System.out.println( x + " não é multiplo de " + y );
        }

        sc.close();
    }
}
