package chapter7.item45.yk;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // stream은 read-only 원본 데이터 변경하지 않음.
        // Iterator처럼 일회용이다.
        // 최종연산은 단 한번만 적용가능(스트림의 요소를 소모)
        Stream<String> strStream = Stream.of(new String[]{"aa", "aa", "bb", "cc"});
        strStream.distinct().limit(2).forEach(System.out::println);

        // 중간연산이 많은 경우 stream 이용하면 편함
        /*
        * filter() : 걸러내기
        * distinct() : 중복제거
        * sort() : 정렬
        * sorted() : 정렬
        * limit() : 스트림 자르기
        *
        * */

        // 최종연산
        /*
        * count() : 요소 개수 세기
        * collect(Collectors.toList()) : 새로운 리스트에 저장
        * foreach() : 반복문
        * */

        // 최종 연산 전까지 중간연산이 수행되지 않는다 -> 지연된 연산
        IntStream intStream = new Random().ints(1, 46); // 1~45범위의 무한스트림
        intStream.distinct().limit(6).sorted()  // 중간연산
                .forEach(i->System.out.print(i+","));   // 최종연산

    }
}
