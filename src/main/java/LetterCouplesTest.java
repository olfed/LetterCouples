package main.java;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class LetterCouplesTest {

    @org.junit.jupiter.api.Test
    void letterCouplesTest() {
        String str = "fff122aaa";
        Assertions.assertEquals("f1a",LetterCouples.letterCouples(str));
    }
    @org.junit.jupiter.api.Test
    void letterCouplesTest0() {
        String str = "bbaaaaaaabbbbbbaaaaassssaaaaabbbbbbaaaaaaabb";
        Assertions.assertEquals("",LetterCouples.letterCouples(str));
    }
    @org.junit.jupiter.api.Test
    void letterCouplesTest1() {
        String str = "2225443";
        Assertions.assertEquals("253",LetterCouples.letterCouples(str));
    }
}