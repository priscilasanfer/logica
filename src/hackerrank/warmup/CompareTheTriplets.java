package hackerrank.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */

public class CompareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> placar = new ArrayList<>(Arrays.asList(0, 0));

        if (a.get(0).equals(b.get(0))) {

        } else if (a.get(0) > b.get(0)) {
            placar.set(0, placar.get(0) + 1);
        } else {
            placar.set(1, placar.get(1) + 1);
        }

        if (a.get(1).equals(b.get(1))) {

        } else if (a.get(1) > b.get(1)) {
            placar.set(0, placar.get(0) + 1);
        } else {
            placar.set(1, placar.get(1) + 1);
        }


        if (a.get(2).equals(b.get(2))) {

        } else if (a.get(2) > b.get(2)) {
            placar.set(0, placar.get(0) + 1);
        } else {
            placar.set(1, placar.get(1) + 1);
        }


        return placar;

    }

    public static void main(String[] args) throws IOException {
        String path = "/Users/priscila.fonseca/projetos-qa/hackerrank/out.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
