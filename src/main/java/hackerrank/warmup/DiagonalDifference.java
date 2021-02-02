package hackerrank.warmup;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

public class DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int primeiraDiagonal = 0;
        int segundaDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            primeiraDiagonal += arr.get(i).get(i);
            segundaDiagonal += arr.get(i).get(arr.size() - 1 - i);

        }
        return Math.abs(primeiraDiagonal - segundaDiagonal);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = "/Users/priscila.fonseca/projetos/logica/out.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
