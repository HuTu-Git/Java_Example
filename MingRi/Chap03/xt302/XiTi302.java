package MingRi.Chap03.xt302;

public class XiTi302 { // 创建类
    static int age = 20; // 声明的类变量。

    public static void map() {
        age = 30;
        String name = "lili";
    }

    public static void main(String[] args) { // 主方法
        // String name = "bilibili";
        // System.out.println(name + "的年龄是：" + age); // 错误代码局部变量不可用于主方法中
    }
}
