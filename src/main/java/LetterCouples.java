package main.java;

import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class LetterCouples {
    //O(N)
    public static String letterCouples(String str){
        char[] charStr = str.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        int i = 1;
        list.push(charStr[0]);
        while (i<charStr.length){
            if (list.size() > 0 && list.peek() == charStr[i]){
                list.pop();
            } else {
                list.push(charStr[i]);
            }
            i++;
        }
        StringBuilder sb = new StringBuilder(list.size());
        for (Character ch : list) {
            sb.append(ch);
        }
        System.out.println(i);
        return sb.reverse().toString();
    }

    //O(2N-2K) = O(N-K) where K = number of couples and max possible 2K = N
    public static String letterCouplesBad(String str){
        Set<Character> charSet = str.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        Character[] arrChars = charSet.toArray(new Character[charSet.size()]);

        int k=0, f = 0, s = 0;
        for (int j = 0; j < arrChars.length; j++) {
            str = str.replace(arrChars[j].toString()+arrChars[j].toString(),"");
            k++;
            f++;
        }
        for (int i=arrChars.length-1; i>=0; i--) {
            str = str.replace(arrChars[i].toString()+arrChars[i].toString(),"");
            k++;
            s++;
        }
        System.out.println(k + " iterations totally, " + f + " iterations in first loop, " + s +
                " iterations in second loop");
        return str;
    }
}
