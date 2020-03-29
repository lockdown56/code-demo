package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListDemo {
    public static void main(String[] args) {
//        iteratorTest();
//        removeIfTest();
//        removeIfWithLambdaTest();
//        replaceAllTest();
//        replaceAllWithLambdaTest();
//        sortTest();
        sortWithLambdaTest();
    }

    private static void iteratorTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            if (it.next().length() > 3) {
                it.remove();
            }
        }

        System.out.println(list);
    }

    public static void removeIfTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 3;
            }
        });

        System.out.println(list);
    }

    private static void removeIfWithLambdaTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(s -> s.length() > 3);

        System.out.println(list);
    }

    private static void replaceAllTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));

        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.length() > 3) {
                    return s.toUpperCase();
                }
                return s;
            }
        });

        System.out.println(list);

    }

    private static void replaceAllWithLambdaTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));

        list.replaceAll(s -> {
            if (s.length() > 3) {
                return s.toUpperCase();
            }
            return s;
        });

        System.out.println(list);
    }

    private static void sortTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(list);
    }

    private static void sortWithLambdaTest() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(list);
    }

}
