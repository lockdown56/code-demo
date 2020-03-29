package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        forEachTest();
//        filterTest();
//        distinctTest();
//        sortedTest();
//        mapTest();
        flatMapTest();
    }

    private static void forEachTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.forEach(System.out::println);
    }

    private static void filterTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.filter(s -> s.length() > 3)
                .forEach(System.out::println);
    }

    private static void distinctTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too", "I", "you");
        stream.distinct()
                .forEach(System.out::println);
    }

    private static void sortedTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.sorted()
                .forEach(System.out::println);
    }

    private static void mapTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        stream.map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void flatMapTest() {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));

        stream.flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
