package MingRi.Chap03.sl316;

public class Arith { // 创建类
    public static void main(String[] args) { // 主方法
        float number1 = 45.56f; // 声明float型变量并赋值
        int number2 = 152; // 声明int型变量并赋值
        System.out.println("和为：" + (number1 + number2)); // 将变量相加之和输出
        System.out.println("差为：" + (number1 - number2)); // 将变量相减之差输出
        System.out.println("积为：" + (number1 * number2)); // 将变量相乘的积输出
        System.out.println("商为：" + (number1 / number2)); // 将变量相除的商输出

        // 自增和自减运算符
        int a = 4, b, c;
        b = ++a; // 先将a的值加1，然后赋给b，此时a的值为5，b值为5
        System.out.println("a值为：" + a + "，b值为：" + b);
        c = --a; // 先将a的值减1，然后赋给c，此时a的值为4，c值为4
        System.out.println("a值为：" + a + "，c值为：" + c);
        b = a++; // 先将a的值赋给b，再将a的值变为5，此时a值为5，b值为4
        System.out.println("a值为：" + a + "，b值为：" + b);
        c = a--; // 先将a的值赋给c，再将a的值变为4，此时a值为4，c值为5
        System.out.println("a值为：" + a + "，c值为：" + c);
    }
}
