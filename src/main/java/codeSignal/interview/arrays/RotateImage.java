package codeSignal.interview.arrays;

/*
Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during
an interview.

You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Example:

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]
 */

public class RotateImage {

    int[][] rotateImage(int[][] a) {
        int length = a.length;
        int[][] newArray = new int[length][length];

        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                newArray[row][column] = a[length - 1 - column][row];
            }
        }
        return newArray;
    }
}
