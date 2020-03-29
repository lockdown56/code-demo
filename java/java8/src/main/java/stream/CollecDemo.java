package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollecDemo {
    public static void main(String[] args) {
        listTest();
        setTest();
        mapTest();
        joinTest();
    }

    /**
     *
     */
    private static void listTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");

//        // <R> Rcollect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
//        // 第一个参数: 目标容器
//        // 第二个参数: 元素如何添加到容器中
//        // 第三个参数: 多个部分结果如何合并
//        List<String> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        // <R, A> R collect(Collector<? sukper T, A, R> collector)
        // Collector 是上面一种方法三个参数的封装
        // Collectors 工具类可以通过静态方法生成各种常见的 Collector
        List<String> list = stream.collect(Collectors.toList());

        System.out.println(list);
    }

    private static void setTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Set<String> set = stream.collect(HashSet::new, HashSet::add, HashSet::addAll);
//        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void mapTest() {
        Stream<String> stream = Stream.of("I", "love", "you", "too");

        Map<String, Integer> map = stream.collect(HashMap::new, (m, v) -> m.put(v, v.length()), HashMap::putAll);

//        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);
    }

    private static void joinTest() {
        Stream<String> stream = Stream.of("I", "love", "you");
//        String joined = stream.collect(Collectors.joining());
//        String joined = stream.collect(Collectors.joining(","));
        String joined = stream.collect(Collectors.joining(",", "(", ")"));

        System.out.println(joined);
    }
}
