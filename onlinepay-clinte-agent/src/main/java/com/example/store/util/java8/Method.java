package com.example.store.util.java8;

import java.util.Arrays;
import java.util.List;
import com.google.common.base.Supplier;

public class Method {

    // jdk 8 内建的函数接口// 调用get（） 才会构造对象
    public static Method create(final Supplier<Method> meSupplier) {
        return meSupplier.get();
    }

    // jdk 8 内建的函数接口// 调用get（） 才会构造对象
    public static void collide(final Method meSupplier) {
       System.out.println(meSupplier.toString());
    }

    public static void main(String[] args) {
        final Method method = create(Method::new);
        List<Method> methods = Arrays.asList(method);
        methods.forEach(Method::collide);
    }
}
