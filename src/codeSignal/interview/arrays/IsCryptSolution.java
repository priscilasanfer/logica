package codeSignal.interview.arrays;

import java.util.HashMap;

/*
A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits,
such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.

You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits,
solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3],
which should be interpreted as the word1 + word2 = word3 cryptarithm.

If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution,
becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true.
If it does not become a valid arithmetic solution, the answer is false.

Note that number 0 doesn't contain leading zeroes (while for example 00 or 0123 do).

Example

For crypt = ["SEND", "MORE", "MONEY"] and

solution = [['O', '0'],
            ['M', '1'],
            ['Y', '2'],
            ['E', '5'],
            ['N', '6'],
            ['D', '7'],
            ['R', '8'],
            ['S', '9']]
the output should be
isCryptSolution(crypt, solution) = true.

When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation.

For crypt = ["TEN", "TWO", "ONE"] and

solution = [['O', '1'],
            ['T', '0'],
            ['W', '9'],
            ['E', '5'],
            ['N', '4']]
the output should be
isCryptSolution(crypt, solution) = false.

Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, meaning that this is not a valid solution.
 */
public class IsCryptSolution {
    public static void main(String[] args) {

        String[] crypt = {"SEND", "MORE", "MONEY"};

        char[][] solution = {
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}
        };


        String[] crypt2 = {"TEN", "TWO", "ONE"};

        char[][] solution2 = {
                {'O', '1'},
                {'T', '0'},
                {'W', '9'},
                {'E', '5'},
                {'N', '4'}
        };


        String[] crypt3 = {"A", "A", "A"};

        char[][] solution3 = {
                {'A', '0'}
        };


//        System.out.println(isCryptSolution(crypt, solution));
//        System.out.println(isCryptSolution(crypt2, solution2));
        System.out.println(isCryptSolution(crypt3, solution3));
    }

    private static boolean isCryptSolution(String[] crypt, char[][] solution) {
        for (char[] chars : solution) {
            for (int i = 0; i < 3; i++) {
                crypt[i] = crypt[i].replace(chars[0], chars[1]);
                System.out.println(crypt[i]);
            }
        }

        if (crypt[0].startsWith("0") && crypt[0].length() != 1 || crypt[1].startsWith("0") && crypt[1].length() != 1 || crypt[2].startsWith("0") && crypt[2].length() != 1) {
            return false;
        }

        Long firstWord = Long.parseLong(crypt[0]);
        Long secondWord = Long.parseLong(crypt[1]);
        Long thirdWord = Long.parseLong(crypt[2]);

        return firstWord + secondWord == thirdWord;
    }
}

