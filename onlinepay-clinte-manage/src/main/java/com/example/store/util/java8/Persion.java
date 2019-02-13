package com.example.store.util.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.assertj.core.condition.Join;
import com.alibaba.druid.util.lang.Consumer;

public class Persion {

    static ArrayList<Persion> javaProgrammers = new ArrayList<Persion>() {
        {
            add(new Persion("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
            add(new Persion("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
            add(new Persion("Floyd", "Donny", "Java programmer", "male", 33, 1800));
            add(new Persion("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
            add(new Persion("Vere", "Hervey", "Java programmer", "male", 22, 1200));
            add(new Persion("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
            add(new Persion("Shawn", "Randall", "Java programmer", "male", 30, 2300));
            add(new Persion("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
            add(new Persion("Palmer", "Dene", "Java programmer", "male", 33, 2000));
            add(new Persion("Addison", "Pam", "Java programmer", "female", 34, 1300));
        }
    };

    private String username, password, sex, firstDate;
    Integer age, boriday;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBoriday() {
        return boriday;
    }

    public void setBoriday(Integer boriday) {
        this.boriday = boriday;
    }

    public Persion() {
        super();
    }

    public Persion(String username, String password, String sex, String firstDate, Integer age,
            Integer boriday) {
        super();
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.firstDate = firstDate;
        this.age = age;
        this.boriday = boriday;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        eachPersion();
    }

    public static void eachPersion() {
        // javaProgrammers.forEach(P1 -> System.out.println("遍历所有数据姓名：" + P1.getUsername()));
        System.out.println("给程序员加薪 5% :");
        // Consumer<Persion> giveRaise = e -> e.setAge(e.getAge() / 100 * 5 + e.getAge());
        // javaProgrammers.forEach(P1 -> System.out.println("遍历所有数据姓名：" + P1.getAge()));

        // 遍历大于26的用户
        // javaProgrammers.stream().filter((P) -> P.getAge() > 26)
        // .forEach(P -> System.out.println("%s" + P.getUsername()));

        // limit 对结果集限制
        // System.out.println("具有结果集限制:");
        // javaProgrammers.stream().filter((P) -> P.getAge() > 26).limit(3)
        // .forEach(P -> System.out.println("%s" + P.getUsername()));

        // 依据姓名排序
        // List<Persion> listPersion = javaProgrammers.stream()
        // .sorted((P1, P2) -> P1.getUsername().compareTo(P2.getUsername())).limit(5)
        // .collect(Collectors.toList());

        // max min 去除其中的最大和最小
        // Persion persion = javaProgrammers.stream().min((P1, P2) -> P1.getAge() -
        // P2.getAge()).get();
        // System.out.println(persion.getUsername());

        // = 拼接字符串
        // String s =
        // javaProgrammers.stream().map(Persion::getUsername).collect(Collectors.joining("="));
        // System.out.println(s);

        /*
         * Set<String> resultSet =
         * javaProgrammers.stream().map(Persion::getPassword).collect(Collectors.toSet());
         * resultSet.forEach(System.out::println);
         */
        // TreeSet<String> resultSet =
        // javaProgrammers.stream().map(Persion::getPassword).collect(toCollection(TreeSet::new));
        // resultSet.forEach(System.out::println);

        // int sum = javaProgrammers.parallelStream().mapToInt(P -> P.getAge()).sum();
        // System.out.println(sum);
        
        
    }
}
