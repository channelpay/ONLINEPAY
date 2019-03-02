package com.example.store.util.java8;

import java.time.Clock;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Function {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11, 35, 17);
        Predicate<Integer> predicate = n -> true;
        // eval(list, predicate);
        // eval(list, a -> a > 5);
        // list.stream().filter(s -> s > 2).forEach(System.out::println);
        //list.stream().sorted().filter(s -> s % 2 != 0).forEach(System.out::println);
        
        hashMap();
    }

    public static void eval(List<Integer> list, Predicate<Integer> proPredicate) {
        for (Integer integer : list) {
            if (proPredicate.test(integer)) {
                System.out.println("-----------:" + integer);
            }
        }
    }

    /**
     * map 测试
     */
    public static void hashMap() {
        Map<Integer, String> requestMap = new HashMap<Integer, String>();
        for (Integer i = 0; i < 50; i++) {
            requestMap.put(i, i + i + "");
        }
        requestMap.forEach((id, val) -> System.out.println(id));
        Clock clock = Clock.systemDefaultZone();
        clock.millis();
        Instant instant =clock.instant();
        Date date =Date.from(instant);
        System.out.print(date);
    }
}
