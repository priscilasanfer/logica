package codeSignal.interview.heapsStacksQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecodeStringTest {

    @Test
    public void teste1() {
        String input = "4[ab]";
        String output = "abababab";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

    @Test
    public void teste2() {
        String input = "";
        String output = "";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

    @Test
    public void teste3() {
        String input = "2[a]3[b]4[c]5[d]";
        String output = "aabbbccccddddd";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

    @Test
    public void teste4() {
        String input = "2[2[2[2[b]]]]";
        String output = "bbbbbbbbbbbbbbbb";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

    @Test
    public void teste5() {
        String input = "z1[y]zzz2[abc]";
        String output = "zyzzzabcabc";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

    @Test
    public void teste6() {
        String input = "2[b3[a]]";
        String output = "baaabaaa";
        Assertions.assertEquals(output, new DecodeString().decodeString(input));
    }

}