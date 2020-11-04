package lista.comandosDeSelecao;

import java.util.Scanner;

/**
Implemente um programa para computar as quatro operações básicas (adição, subtração, multiplicação e
divisão) com operandos inteiros. O seu programa deve receber como entrada, além de dois números inteiros,
um caractere correspondente à operação (’+’, ’-’, ’*’, /’), sendo que eles devem ser informados em
uma mesma linha. Exemplos:
-- Exemplo 1:
2+3
5
-- Exemplo 2:
3-8
-5
-- Exemplo 3:
7/8
0
-- Exemplo 4:
7*3
21

**/
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação desejada: ");
        String str = sc.next();
        int a = Character.getNumericValue(str.charAt(0));
        char b = str.charAt(1);
        int c = Character.getNumericValue(str.charAt(2));

        if (b == '+'){
            int soma =  a +  c;
            System.out.println(soma);
        }else if(b == '-'){
            int subtracao = a  - c;
            System.out.println(subtracao);
        }else if(b == '/'){
            int divisao =  a /  c;
            System.out.println(divisao);
        }else{
            int multiplicacao =  a * c;
            System.out.println(multiplicacao);
        }

       sc.close();
    }
}
