package codeSignal.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsCryptSolutionTest {

    @Test
    public void teste1() {
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
        Assertions.assertTrue(new IsCryptSolution().isCryptSolution(crypt, solution));
    }

    @Test
    public void teste2() {
        String[] crypt = {"TEN", "TWO", "ONE"};
        char[][] solution = {
                {'O', '1'},
                {'T', '0'},
                {'W', '9'},
                {'E', '5'},
                {'N', '4'}
        };
        Assertions.assertFalse(new IsCryptSolution().isCryptSolution(crypt, solution));
    }

    @Test
    public void teste3() {
        String[] crypt = {"A", "A", "A"};
        char[][] solution = {
                {'A', '0'}
        };
        Assertions.assertTrue(new IsCryptSolution().isCryptSolution(crypt, solution));
    }
}
