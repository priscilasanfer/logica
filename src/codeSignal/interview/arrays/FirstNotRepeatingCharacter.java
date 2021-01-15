package codeSignal.interview.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given a string s consisting of small English letters, find and return the first instance of a non-repeating character
in it. If there is no such character, return '_'.

Example:

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.
 */

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
