package MingRi.Chap03.sl315;

public class Eval { // 创建类
    public static void main(String[] args) { // 主方法
        int a, b, c; // 声明int型变量a、b、c
        a = 15; // 将15赋值给变量a
        c = b = a + 4; // 将a与4的和赋值给变量b，然后再赋值给变量c
        System.out.println("c的值为：" + c); // 将c的值输出
        System.out.println("b的值为：" + b); // 将b的值输出
    }
}
