package lista.comandosDeSelecao;
/*
Implemente um programa que recebe três caracteres como dados de
entrada e os imprime em ordem alfabética. Exemplos:
-- Exemplo 1:
Entrada
a b c
Saída
a b c
-- Exemplo 2:
Entrada
b c a
Saída
a b c
-- Exemplo 1:
Entrada
z j a
Saída
a j z
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres caracteres: ");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);

        if (a < b && a < c && b < c ) {
            System.out.println(a + " " + " " + b + " " + c);
        } else if (a < b && a < c && c < b){
            System.out.println(a + " " + " " + c + " " + b);
        } else if (b < a && b < c && a < c ){
            System.out.println(b + " " + " " + a + " " + c);
        }else if(b < a && b < c && c < a){
            System.out.println(b + " " + " " + c + " " + a);
        } else if(c < a && c < b && a < b) {
            System.out.println(c + " " + " " + a + " " + b);
        } else{
            System.out.println(c + " " + " " + b + " " + a);
        }

        sc.close();
    }
}
