package codeSignal.interview.heapsStacksQueues;
/*
Given an encoded string, return its corresponding decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is repeated exactly k times.
Note: k is guaranteed to be a positive integer.

Note that your solution should have linear complexity because this is what you will be asked during an interview.

Example

For s = "4[ab]", the output should be
decodeString(s) = "abababab";

For s = "2[b3[a]]", the output should be
decodeString(s) = "baaabaaa";

For s = "z1[y]zzz2[abc]", the output should be
decodeString(s) = "zyzzzabcabc".
 */

import java.util.Stack;

public class DecodeString {
    String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();

        String res = "";
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index += 1;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                result.push(res);
                res = "";
                index += 1;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index += 1;
            } else {
                res += s.charAt(index);
                index += 1;
            }
        }
        return res;
    }
}
