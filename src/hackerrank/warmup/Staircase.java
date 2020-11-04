package hackerrank.warmup;

import java.util.Scanner;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
//     # i=0
//    ## i=1
//   ### i=2
//  #### i=3
// ##### i=4
//###### i=5
        String str = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + (n) + "s \n", str);
            str += "#";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
