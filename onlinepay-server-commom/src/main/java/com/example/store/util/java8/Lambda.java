package com.example.store.util.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author ONEC
 *
 */
class Lambda {

//    public static void main(String[] args) {
//        String[] a = {"java", "c", "go", "php", "phy"};
//        List<String> string = Arrays.asList(a);
//        System.out.println("原始数据格式：" + string);
//        System.out.println("java7的编程风格：");
//        Lambda.sortUsingJava7(string);
//        System.out.println("java7的编程风格：" + string);
//        System.out.println("java8的编程风格：");
//        Lambda.sortUsingJava8(string);
//        System.out.println("java8的编程风格：" + string);
//    }

    /**
     * @1 申明参数/未申明参数
     */
    public static void testOne(Integer a, Integer b) {


    }

    @FunctionalInterface
    interface MathOperation {
        Integer operation(Integer a, Integer b);

        default String getvalue() {
            return "接口默认方法";
        }
    }
    // 接口的实现类
    class Math implements MathOperation {

        @Override
        public Integer operation(Integer a, Integer b) {
            return null;
        }

    }

    // 使用 java 7 排序
    private static void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    // 使用 java 8 排序
    private static void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }

    // stream 的使用
    private static void sortMap() {

    }
}


