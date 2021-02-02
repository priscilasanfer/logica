package lista.comandosDeSelecao;

import java.util.Scanner;

/**
Implemente um programa que recebe como entrada três números
inteiros. O seu programa deve imprimir uma mensagem na tela informando se os números fornecidos constituem os lados de um triângulo ou não. Além disso, o programa deve imprimir também qual é o tipo do
triângulo formado: equilátero (três lados iguais), isósceles (dois lados iguais) ou escaleno (três lados diferentes). Considere que para constituir um triângulo, cada um dos lados tem que ser menor do que a soma dos
outros dois. Exemplos:
6 3 3: Numeros nao formam triangulo
2 2 2: Numeros formam triangulo equilatero
5 10 9: Numeros formam triangulo escaleno
6 6 9: Numeros formam triangulo isosceles
 **/
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verificar se tres números fornecidos constituem os lados de um triângulo ou não");
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int c = sc.nextInt();


        if(a < b + c && b < a + c && c < a + b){
            if (a == b && a == c ) {
                System.out.println( a + " " +  b + " " + c + ": Numeros formam triangulo equilatero");
            } else if (a==b || a==c || b==c){
                System.out.println( a + " " +  b + " " + c + ": Numeros formam triangulo isosceles");
            }else{
                System.out.println( a + " " +  b + " " + c + ": Numeros formam triangulo escaleno");
            }
        }else{
            System.out.println( a + " " +  b + " " + c + ": Numeros nao formam triangulo");
        }

        sc.close();
    }
}
