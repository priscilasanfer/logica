package codeSignal.interview.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String texto = "abacabaabacaba";

        Set<Character> repetidas = new HashSet<>();
        List<Character> naoRepetidas = new ArrayList<>();

        for (int i = 0; i < texto.length() ; i++) {
            char caracter = texto.charAt(i);
            if(repetidas.contains(caracter)){
                continue;
            }
            if(naoRepetidas.contains(caracter)){
                naoRepetidas.remove((Character) caracter);
                repetidas.add(caracter);
            }else {
                naoRepetidas.add(caracter);
            }
        }
        if (naoRepetidas.isEmpty()){
            System.out.println("_");
        }else {
            System.out.println(naoRepetidas.get(0));
        }
    }
}
