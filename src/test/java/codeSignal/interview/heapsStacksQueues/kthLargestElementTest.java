package codeSignal.interview.heapsStacksQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class kthLargestElementTest {

    @Test
    public void teste1() {
        int[] input = {7, 6, 5, 4, 3, 2, 10, 12};
        int k = 2;
        int output = 10;
        Assertions.assertEquals(output, new kthLargestElement().kthLargestElement(input, k));
    }


    @Test
    public void teste2() {
        int[] input = {1};
        int k = 1;
        int output = 1;
        Assertions.assertEquals(output, new kthLargestElement().kthLargestElement(input, k));
    }

    @Test
    public void teste3() {
        int[] input = {-1, 2, 0};
        int k = 2;
        int output = 0;
        Assertions.assertEquals(output, new kthLargestElement().kthLargestElement(input, k));
    }


    @Test
    public void teste4() {
        int[] input = {3, 3, 3, 3, 4, 3, 3, 3, 3};
        int k = 1;
        int output = 4;
        Assertions.assertEquals(output, new kthLargestElement().kthLargestElement(input, k));
    }

}