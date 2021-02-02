package buscape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Dada uma sequencia de caracteres dada pelo usuario, verificar se a sintaxe está OK

 **/
public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        List<String> caracteresDeAbertura = new ArrayList<>();
        List<String> caracteresDeFechamento = new ArrayList<>();

        System.out.println("Digite o texto desejado para que seja analisado:");
        String texto = sc.nextLine();

        converteTextoEmLista(lista, texto);

        for (String caracter : lista) {
            if (caracter.equals("(") || caracter.equals("[") || caracter.equals("{")) {
                caracteresDeAbertura.add(caracter);
            }

            if (caracter.equals(")") && existeAntecessor(caracteresDeAbertura, caracter, caracteresDeFechamento)) {
                caracteresDeAbertura.remove(caracteresDeAbertura.size() - 1);
            }

            if (caracter.equals("]") && existeAntecessor(caracteresDeAbertura, caracter, caracteresDeFechamento)) {
                caracteresDeAbertura.remove(caracteresDeAbertura.size() - 1);
            }

            if (caracter.equals("}") && existeAntecessor(caracteresDeAbertura, caracter, caracteresDeFechamento)) {
                caracteresDeAbertura.remove(caracteresDeAbertura.size() - 1);
            }
        }

        if (caracteresDeAbertura.isEmpty() && caracteresDeFechamento.isEmpty()) {
            System.out.println("A sintaxe esta OK");
        } else {
            System.out.println("A sintaxe não esta OK");
        }

        sc.close();
//        ([]())[[]]])
//        []])
//     () kfjhskdfhsdkjfh {%%%%%%%ˆˆˆˆˆ&&&} [lkdflsdjfldksf]
    }

    private static void converteTextoEmLista(List<String> lista, String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            lista.add(Character.toString(c));
        }
    }

    private static boolean existeAntecessor(List<String> caracteresDeAbertura, String caracter, List<String> caracteresDeFechamento) {
        String caracterOposto = caracterOposto(caracter);

        if (caracteresDeAbertura.isEmpty() || !caracteresDeAbertura.get(caracteresDeAbertura.size() - 1).equals(caracterOposto)) {
            caracteresDeFechamento.add(caracter);
            return false;
        }
        return true;
    }

    private static String caracterOposto(String caracter) {
        String caracterOposto;

        switch (caracter) {
            case "]":
                caracterOposto = "[";
                break;
            case "}":
                caracterOposto = "{";
                break;
            case ")":
                caracterOposto = "(";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + caracter);
        }
        return caracterOposto;
    }
}
