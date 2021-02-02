package lista.comandosRepeticaoFor;
/*
Implemente um programa que lê um número n e em seguida, lê n caracteres.
O seu programa deve exibir a quantidade de caracteres digitados que são letras, considerando que o usuário pode digitar
letras minúsculas ou maiúsculas. Exemplo:
Insira a quantidade de caracteres: 5
Insira os caracteres:
Aa7&J
Total de letras digitadas: 3
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de caracteres: ");
        int n = sc.nextInt();

        System.out.println("Insira os caracteres: ");
        sc.nextLine();
        String palavra = sc.nextLine();
        palavra = palavra.toUpperCase();

        int soma = 0;
        for(int i = 0; i < n; i++){
            char resp = palavra.charAt(i);

            int ascii = (int)resp;

            if(ascii >= 65 && ascii <= 90){
                soma++;
            }
        }

        System.out.println("Total de letras digitadas: " + soma);

        sc.close();

    }
}
