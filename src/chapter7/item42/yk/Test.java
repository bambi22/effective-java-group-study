package chapter7.item42.yk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class Test {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"오월", "이십칠일"});
        List<String> words2 = Arrays.asList(new String[]{"이십칠일", "이십구일", "삼십일"});

        Collections.sort(words, comparingInt(String::length));

        // 자바 8부터 List 인터페이스에 추가된 sort
        words2.sort(comparingInt(String::length));


        System.out.println(words);
        System.out.println(words2);
    }
}
