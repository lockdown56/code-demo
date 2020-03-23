package demo;

import demo.annotation.MyAnnotation;

@MyAnnotation(value = "demo.annotation on class")
public class Demo {
    @MyAnnotation(value = "demo.annotation on field")
    public String name;

    @MyAnnotation(value = "demo.annotation on method")
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
