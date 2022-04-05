package MingRi.Chap05.sl519;

public class Wordbook { // 创建类
    public static void main(String[] args) { // 主方法
        // 用于比较的3个字符串
        String str1 = new String("b");
        String str2 = new String("a");
        String str3 = new String("c");
        System.out.println(str1 + " compareTo " + str2 + ":" + str1.compareTo(str2)); // 将str1与str2比较的结果输出
        System.out.println(str1 + " compareTo " + str3 + ":" + str1.compareTo(str3)); // 将str1与str3比较的结果输出
    }
}
