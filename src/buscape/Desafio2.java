package buscape;

import java.util.Scanner;
import java.util.Stack;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();
        int erro = 0;

        System.out.println("Digite o texto desejado para que seja analisado:");

        String texto = sc.nextLine();
        String[] caracter = texto.split("");

        for (int i = 0; i < caracter.length; i++) {
            if (caracter[i].equals("(") || caracter[i].equals("{") || caracter[i].equals("[")) {
                pilha.push(caracter[i]);
            }

            if(pilha.isEmpty()) {
                if (caracter[i].equals("}") || caracter[i].equals(")") || caracter[i].equals("]")) {
                    erro++;
                    break;
                }
            }

            if (caracter[i].equals("}") && pilha.peek().equals("{")){
                pilha.pop();
            }

            if (caracter[i].equals(")") && pilha.peek().equals("(")){
                pilha.pop();
            }

            if (caracter[i].equals("]") && pilha.peek().equals("[")){
                pilha.pop();
            }
        }

        if(pilha.isEmpty() && erro == 0){
            System.out.println("A Sintaxe está ok");
        }
        else {
            System.out.println("A Sintaxe não está ok");
        }

        sc.close();
    }
}
