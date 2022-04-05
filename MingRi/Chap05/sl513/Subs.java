package MingRi.Chap05.sl513;

public class Subs { // 创建类
    public static void main(String[] args) {// 主方法
        String str = "Hello World"; // 定义字符串
        String substr = str.substring(0, 3); // 对字符串进行截取
        System.out.println(substr); // 输出截取后的字符串
        System.out.println(str.substring(3));
        System.out.println(str.substring(1, 10));
    }
}
