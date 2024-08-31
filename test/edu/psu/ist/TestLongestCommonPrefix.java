package edu.psu.ist;

import java.util.ArrayList;

public class TestLongestCommonPrefix {
    @Test
    public void testTwoStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");

        String result = app.findLongestCommonPrefix(strings);
        Assertions.assertEquals("flow", result);
    }

    @Test
    public void testThreeStrings() {
        LongestCommonPrefix app = new LongestCommonPrefix();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");
        strings.add("flight");

        String result = app.findLongestCommonPrefix(strings);
        Assertions.assertEquals("fl", result);
    }
}
