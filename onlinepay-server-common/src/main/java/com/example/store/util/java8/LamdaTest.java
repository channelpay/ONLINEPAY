package com.example.store.util.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * java 8 lamda 表达式测试
 * 
 * @author ONEC
 *
 */
public class LamdaTest {

    public static String[] simple =
            {"merchantNo", "channnelId", "orderNum", "complatedate", "createdate", "orderstatus",
                    "ordreamount", "orderfee", "channlefee", "supertoken", "payername"};
    public static List<String> simpleList = Arrays.asList(simple);


    /**
     * 遍历数组
     */
    public static void simForEach(List<String> list) {
        // java 7 遍历数组
        for (int i = 0; i < simple.length; i++) {

        }

        for (String string : list) {
            System.out.println("java7遍历数据：" + string);
        }
        // java 8
        list.forEach(apple -> System.out.println("java8 遍历数据：" + apple));
        // java8
        list.forEach(System.out::println);

    }

    /**
     * 生成的线程（匿名内部内）
     */
    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("java7运行多线程");
        }
    };
    // JAVA 8
    Runnable re = () -> System.out.println("something ");


    public static void main(String[] args) {
        // simForEach(simpleList);
        // runtest r = new runtest();
        // r.run();

        // boolean flagTest = testPredicate("tests", x -> x.equals("test"));
        // System.out.println(flagTest);

        // sortArray();
        sort8();
    }

    /**
     * 申明是一个函数式接口
     * 
     * @author ONEC
     *
     * @param <T>
     */
    @FunctionalInterface
    interface Predicate<T> {
        boolean test(T t);
    }

    /**
     * 判断方法
     * 
     * @param merchentNo
     * @param channle
     * @return
     */
    public static boolean testPredicate(String merchentNo, Predicate<String> proPredicate) {
        return proPredicate.test(merchentNo);
    }

    // 匿名内部类的使用
    public static void goback() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("java7 匿名内部类的使用：");
            }
        }).start();

        new Thread((Runnable) System.out.printf("执行线程：java8")).start();
    }


    /**
     * java 7 匿名内部实现排序
     */
    public static void sortArray() {
        Arrays.sort(simple, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < simple.length; i++) {
            System.out.println(simple[i]);
        }
    }

    /**
     * java8 实现排序
     */
    public static void sort8() {
        Arrays.sort(simple, (p1, p2) -> p1.compareTo(p2));

        for (int i = 0; i < simple.length; i++) {
            System.out.println(simple[i]);
        }

        // 字符传长度
        Arrays.sort(simple, (p1, p2) -> p1.length() - p2.length());
        for (int i = 0; i < simple.length; i++) {
            System.out.println(simple[i]);
        }

        // 最后一个字符
        Arrays.sort(simple, (P1, P2) -> P1.charAt(P1.length() - 1) - P2.charAt(P2.length() - 1));
        for (int i = 0; i < simple.length; i++) {
            System.out.println(simple[i]);
        }
    }
}


/**
 * 多线程内部
 * 
 * @author ONEC
 *
 */
class runtest implements Runnable {
    @Override
    public void run() {
        System.out.println("java7运行多线程");
    }
}
