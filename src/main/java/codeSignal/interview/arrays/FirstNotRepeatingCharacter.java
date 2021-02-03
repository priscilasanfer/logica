package codeSignal.interview.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    char firstNotRepeatingCharacter(String s) {
        HashSet<Character> repetidas = new HashSet<>();
        List<Character> naoRepetidas = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (repetidas.contains(character)) {
                continue;
            }

            if (naoRepetidas.contains(character)) {
                naoRepetidas.remove((Character) character);
                repetidas.add(character);
            } else {
                naoRepetidas.add(character);
            }
        }
        if (naoRepetidas.isEmpty()) {
            return '_';
        } else {
            return naoRepetidas.get(0);
        }
    }
}
