package codeSignal.interview.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateImageTest {

    @Test
    public void teste1() {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] output = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        Assertions.assertEquals(Arrays.deepToString(output), Arrays.deepToString(new RotateImage().rotateImage(input)));
    }

    @Test
    public void teste2() {
        int[][] input = {{1}};
        int[][] output = {{1}};
        Assertions.assertEquals(Arrays.deepToString(output), Arrays.deepToString(new RotateImage().rotateImage(input)));
    }

    @Test
    public void teste3() {
        int[][] input = {{10, 9, 6, 3, 7}, {6, 10, 2, 9, 7}, {7, 6, 3, 8, 2}, {8, 9, 7, 9, 9}, {6, 8, 6, 8, 2}};
        int[][] output = {{6, 8, 7, 6, 10}, {8, 9, 6, 10, 9}, {6, 7, 3, 2, 6}, {8, 9, 8, 9, 3}, {2, 9, 2, 7, 7}};
        Assertions.assertEquals(Arrays.deepToString(output), Arrays.deepToString(new RotateImage().rotateImage(input)));
    }
}
