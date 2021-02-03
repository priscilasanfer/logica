package codeSignal.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstNotRepeatingCharacterTest {

    @Test
    public void teste1() {
        String input = "abacabad";
        char output = 'c';
        Assertions.assertEquals(output, new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(input));
    }

    @Test
    public void teste2() {
        String input = "abacabaabacaba";
        char output = '_';
        Assertions.assertEquals(output, new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(input));
    }

    @Test
    public void teste3() {
        String input = "bcccccccb";
        char output = '_';
        Assertions.assertEquals(output, new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(input));
    }
}
