package MingRi.Chap05.sl514;

public class Blak { // 创建类
    public static void main(String[] args) { // 主方法
        String str = "  Java  class   "; // 定义字符串
        System.out.println("字符串原来的长度：" + str.length()); // 将str原来的长度输出
        // 将str去掉前导和尾部的空格后的结果输出
        System.out.println("去掉空格后的长度：" + str.trim().length());
    }
}
