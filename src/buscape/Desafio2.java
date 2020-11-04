package buscape;

import java.util.Scanner;
import java.util.Stack;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> pilhaDeCaracterDeAbertura = new Stack<>();
        Stack<String> pilhaDeCaracterFechamento = new Stack<>();

        System.out.println("Digite o texto desejado para que seja analisado:");

        String texto = sc.nextLine();
        String[] caracter = texto.split("");

        for (int i = 0; i < caracter.length; i++) {
            if (caracter[i].equals("(") || caracter[i].equals("{") || caracter[i].equals("[")) {
                pilhaDeCaracterDeAbertura.push(caracter[i]);
            }

            if(caracter[i].equals(")")) {
                if (!pilhaDeCaracterDeAbertura.isEmpty() && pilhaDeCaracterDeAbertura.peek().equals("(")){
                    pilhaDeCaracterDeAbertura.pop();
                } else{
                   pilhaDeCaracterFechamento.push(caracter[i]);
                    break;
                }
            }

            if(caracter[i].equals("]")) {
                if (!pilhaDeCaracterDeAbertura.isEmpty() && pilhaDeCaracterDeAbertura.peek().equals("[")){
                    pilhaDeCaracterDeAbertura.pop();
                }else{
                    pilhaDeCaracterFechamento.push(caracter[i]);
                    break;
                }
            }

            if(caracter[i].equals("}")) {
                if (!pilhaDeCaracterDeAbertura.isEmpty() && pilhaDeCaracterDeAbertura.peek().equals("{")){
                    pilhaDeCaracterDeAbertura.pop();
                }else{
                    pilhaDeCaracterFechamento.push(caracter[i]);
                    break;
                }
            }
        }

        if (pilhaDeCaracterDeAbertura.isEmpty() && pilhaDeCaracterFechamento.isEmpty()){
            System.out.println("A sintaxe está OK");
        }else {
            System.out.println("A sintaxe não está OK");
        }

        sc.close();
    }
}
