package com.example.store.util.random;

import java.util.Random;

/**
 * 随机数生成实例
 *
 * @author 26500
 *
 */
public class RandomUtil {

    /**
     * 生成固定位数的字符串（转为大写）
     *
     * @param length
     * @return String
     */
    public static String getRandom(Integer length) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString().toUpperCase();
    }

}
