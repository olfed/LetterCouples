package main.java;

import main.java.LetterCouples;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "aabbbbaaf";
        System.out.println(str + " " + str.length());
        System.out.println(LetterCouples.letterCouples(str));
    }
}