package MingRi.Chap03.sl301; //包声明

public class Frist {
    static String s1 = "你好"; // s1为全局变量（成员变量），声明在类体中

    public static void main(String[] args) { // 主方法
        String s2 = "Java"; // s2是局部变量，声明在方法体中
        // final String s1 = "我正在学习"; // 在方法体中声明s1局部变量
        System.out.println(s1);
        System.out.println(s2);
    }
}
