package codeSignal.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstDuplicateTest {

    @Test
    public void teste1() {
        int[] input = {2, 1, 3, 5, 3, 2};
        int output = 3;
        Assertions.assertEquals(output, new FirstDuplicate().firstDuplicate(input));
    }

    @Test
    public void teste2() {
        int[] input = {2, 2};
        int output = 2;
        Assertions.assertEquals(output, new FirstDuplicate().firstDuplicate(input));
    }

    @Test
    public void teste3() {
        int[] input = {2, 4, 3, 5, 1};
        int output = -1;
        Assertions.assertEquals(output, new FirstDuplicate().firstDuplicate(input));
    }

}
