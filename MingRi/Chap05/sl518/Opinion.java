package MingRi.Chap05.sl518;

public class Opinion { // 创建类
    public static void main(String[] args) { // 主方法
        String s1 = new String("abc"); // 创建字符串对象s1
        String s2 = new String("ABC"); // 创建字符串对象s2
        String s3 = new String("abc"); // 创建字符串对象s3equalsIgnoreCase
        boolean b1 = s1.equals(s2); // 使用equals()方法比较s1与s2
        // 使用equalsIgnoreCase()方法比较s1与s2
        boolean b2 = s1.equalsIgnoreCase(s2);
        boolean b3 = s1.equals(s3);
        // 输出信息
        System.out.println(s1 + " equals " + s2 + ":" + b1);
        System.out.println(s1 + " equalsIgnoreCase " + s2 + ":" + b2);
        System.out.println(s1 + " equals " + s3 + ":" + b3);
    }
}
