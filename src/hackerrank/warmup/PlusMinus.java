package hackerrank.warmup;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        double neutro = 0;
        double positivo = 0;
        double negativo = 0;

        for (int numero : arr){
            if(numero == 0){
                neutro ++;
            }
            if (numero > 0){
                positivo ++;
            }

            if (numero < 0){
                negativo++;
            }
        }

        System.out.printf("%.6f %n", positivo / arr.length);
        System.out.printf("%.6f %n",negativo / arr.length);
        System.out.printf("%.6f %n",neutro / arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
