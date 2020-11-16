package codeSignal.interview.arrays;

import java.util.HashSet;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] ar= {2,1,3,5,3,2};

        HashSet<Integer> resultado = new HashSet<>();

        for (int i = 0; i < ar.length; i++) {
            if (resultado.contains(ar[i])) {
                System.out.println(ar[i]);
                break;
            } else
                resultado.add(ar[i]);
        }

    }
}
