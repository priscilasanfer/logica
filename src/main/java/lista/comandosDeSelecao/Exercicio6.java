package lista.comandosDeSelecao;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
Implemente um programa que recebe como entrada um caractere e informa se ele é uma vogal, uma consoante
ou um símbolo qualquer. Assuma que as letras digitadas serão sempre minúsculas. Exemplos:
a e uma vogal
f e uma consoante
6 e um simbolo qualquer
[ e um simbolo qualquer
**/
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caracter: ");

        String caracter = sc.next();

        boolean vogal = Pattern.matches("[aeiou]", caracter);

        boolean consoante = Pattern.matches("[b-d,f-h,j-n,p-t,v-z]", caracter);

        if(vogal){
            System.out.println(caracter + " e uma vogal");
        } else if (consoante){
            System.out.println(caracter + " e uma consoante");
        } else{
            System.out.println(caracter + " e um simbolo qualquer");
        }

        sc.close();
    }
}
