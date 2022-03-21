package MingRi.Chap03.sl306;

public class Gess { // 定义类
    public static void main(String[] args) { // 主方法
        char word = 'd', word2 = '@'; // 定义char型变量
        int p = 23045, p2 = 45213; // 定义int型变量
        System.out.println("d在unicode表中的顺序位置是：" + (int) word);
        System.out.println("@在unicode表中的顺序位置是：" + (int) word2);
        System.out.println("unicode表中的第23045位是：" + (char) p);
        System.out.println("unicode表中的第45213位是：" + (char) p2);

        // 转义字符
        char c1 = '\\'; // 将转义字符'\\'赋值给变量c1
        char char1 = '\u2605'; // 将转义字符'\u2605'赋值给变量char1
        System.out.println(c1); // 输出结果\
        System.out.println(char1); // 输出结果★
    }
}
