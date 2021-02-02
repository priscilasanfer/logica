package lista.comandosDeSelecao;

import java.util.Scanner;

/**
Implemente um programa que recebe como entrada um ano e informa se ele é bissexto ou não. Os anos
bissextos são aqueles que são múltiplos de 4, mas que não são múltiplos de 100, com exceção daqueles que
são múltiplos de 400. Exemplos:
1999 nao e um ano bissexto
2000 e um ano bissexto
1998 nao e um ano bissexto
1900 nao e um ano bissexto
2016 e um ano bissexto
400 e um ano bissexto
 **/
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano desejado para saber se ele é bissexto: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println(ano + " é um ano bissexto ");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }

        sc.close();
    }

}
