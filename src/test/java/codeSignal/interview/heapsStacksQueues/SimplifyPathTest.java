package codeSignal.interview.heapsStacksQueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimplifyPathTest {

    @Test
    public void teste1() {
        String input = "/home/a/./x/../b//c/";
        String output = "/home/a/b/c";
        Assertions.assertEquals(output, new SimplifyPath().simplifyPath(input));
    }

    @Test
    public void teste2() {
        String input = "/a/b/c/../..";
        String output = "/a";
        Assertions.assertEquals(output, new SimplifyPath().simplifyPath(input));
    }

    @Test
    public void teste3() {
        String input = "/../";
        String output = "/";
        Assertions.assertEquals(output, new SimplifyPath().simplifyPath(input));
    }

    @Test
    public void teste4() {
        String input = "/";
        String output = "/";
        Assertions.assertEquals(output, new SimplifyPath().simplifyPath(input));
    }

    @Test
    public void teste5() {
        String input = "/home/a/./x/../b//c/";
        String output = "/home/a/b/c";
        Assertions.assertEquals(output, new SimplifyPath().simplifyPath(input));
    }
}
