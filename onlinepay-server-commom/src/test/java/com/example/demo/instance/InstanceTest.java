package com.example.demo.instance;

/**
 * instanceof 测试
 * 
 * @author ONEC
 *
 */
public class InstanceTest extends InstanceParent {

    public static void main(String[] args) {
        System.out.println("字符串是不是String的实例：" + InstanceTest.instancStr());
        System.out.println(InstanceTest.instancInstance());
        System.out.println(InstanceTest.instancInstanceParent());
    }

    /**
     * 判断字符串是不是String的实例
     * 
     * @return
     */
    public static boolean instancStr() {
        return "a" instanceof String;
    }

    public static boolean instancInstance() {
        InstanceTest instanceTest = null;
        System.out.println(
                "instanceTest 是 InstanceTest的实例：  " );
        return instanceTest instanceof Object;
    }
    
    // 判断是不是 InstanceTest 的shili
    public static boolean instancInstances() {
        InstanceTest instanceTest = new InstanceTest();
        System.out.println(
                "instanceTest 是 instancInstanceParent的实例：  " );
        return instanceTest instanceof InstanceTest;
    }
    
    // 判断是不是 InstanceTest 的shili
    public static boolean instancInstanceParent() {
        InstanceTest instanceTest = new InstanceTest();
        System.out.println(
                "instanceTest 是 instancInstanceParent的实例：  " );
        return instanceTest instanceof InstanceParent;
    }
}


class InstanceParent {

}
