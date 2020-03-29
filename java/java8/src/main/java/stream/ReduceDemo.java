package stream;

import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        reduceTest();
    }

    /**
     * 求出一组单词的长度之和
     */
    private static void reduceTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");

        Integer lengthSum = stream.reduce(0,
                (sum, str) -> sum + str.length(),
                (a, b) -> a + b
        );

        System.out.println(lengthSum);
    }
}
