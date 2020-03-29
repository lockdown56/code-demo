package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapDemo {
    private static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

//        iterateTest();
//        forEachTest();
//        forEachWithLambdaTest();
//        replaceAllTest();
//        replaceAllWithLambdaTest();
//        mergeTest();
//        computeTest();
//        computeIfAbsent();
        computeIfPresent();
    }

    private static void iterateTest() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void forEachTest() {
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer k, String v) {
                System.out.println(k + "=" + v);
            }
        });
    }

    private static void forEachWithLambdaTest() {
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    private static void replaceAllTest() {
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer integer, String s) {
                return s.toUpperCase();
            }
        });

        System.out.println(map);
    }

    private static void replaceAllWithLambdaTest() {
        map.replaceAll((k, v) -> v.toUpperCase());
    }

    private static void mergeTest() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", null);

        map.merge("msg", "error", (v1, v2) -> v1 + v2);

        System.out.println(map);
    }

    private static void computeTest() {
        Map<String, String> map = new HashMap<>();
        map.put("msg", "hello");

        map.compute("msg", (k, v) -> "world");

        System.out.println(map);
    }

    private static void computeIfAbsent() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhang");

        map.computeIfAbsent("age", v -> "18");

        map.computeIfAbsent("name", v -> "wang");

        System.out.println(map);
    }

    private static void computeIfPresent() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "zhang");

        map.computeIfPresent("age", (k, v) -> "18");

        map.computeIfPresent("name", (k, v) -> "wang");

        System.out.println(map);
    }
}
