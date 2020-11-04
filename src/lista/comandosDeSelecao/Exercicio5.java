package lista.comandosDeSelecao;

import java.util.Scanner;

/**
Implemente um programa que imprime uma mensagem na tela informando se um ponto 2D faz parte de um
retângulo ou não. O seu programa deve receber como entrada os seguintes dados:
• As coordenadas x e y do ponto
• As coordenadas xse e yse do vértice superior esquerdo do retângulo
• As coordenadas xid e yid do vértice inferior direito do retângulo

Dica: observe a direção de crescimento do sistema de coordenadas e também que os vértices informados
delimitam uma região. A partir disto, tente construir uma expressão lógica que retorna verdadeiro sempre
que x e y estiver dentro dos limites desta região.
*/
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas x e y do ponto");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Digite as coordenadas xse e yse do vértice superior esquerdo do retângulo");
        int xse = sc.nextInt();
        int yse = sc.nextInt();

        System.out.println("Digite as coordenadas xid e yid do vértice inferior direito do retângulo");
        int xid = sc.nextInt();
        int yid = sc.nextInt();

        if (x >= xse && x <= xid){
            if (y >= yid && y <= yse){
                System.out.println("O ponto 2D informado faz parte do retângulo.");
            }else {
                System.out.println("O ponto 2D informado não faz parte do retângulo");
            }
        }else{
            System.out.println("O ponto 2D informado não faz parte do retângulo.");
        }

        sc.close();
    }
}

