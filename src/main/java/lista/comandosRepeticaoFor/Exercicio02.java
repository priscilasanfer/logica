package lista.comandosRepeticaoFor;
/*
Implemente um programa que recebe como entrada um número inteiro n e em seguida, lê n números inteiros informados pelo usuário.
O seu programa deve imprimir na tela o menor e o maior número informados. Exemplo:
Insira a quantidade de numeros
5
Insira os numeros
2 7 -10000 988 3
Menor: -10000, maior: 988
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorMinimo = 0;
        int valorMaximo = 0;


        System.out.print("Insira a quantidade de numeros: ");
        int n = sc.nextInt();
        List<Integer> lista = new ArrayList<Integer>(n);

        System.out.println("Insira os numeros: ");

        for (int i =0; i < n; i++){
            lista.add(sc.nextInt());
            if (lista.get(i) > valorMaximo){
                valorMaximo = lista.get(i);
            }

            if(lista.get(i) < valorMinimo){
                valorMinimo = lista.get(i);
            }
        }

        System.out.println("Menor: " + valorMinimo + ", maior: " + valorMaximo);
        
        sc.close();
    }
}
