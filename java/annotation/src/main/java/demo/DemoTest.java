package demo;

import demo.annotation.MyAnnotation;

public class DemoTest {
    public static void main(String[] args) {
        Class<Demo> clazz = Demo.class;

        MyAnnotation annotationOnClass = clazz.getAnnotation(MyAnnotation.class);
        System.out.println(annotationOnClass.value());
    }
}
