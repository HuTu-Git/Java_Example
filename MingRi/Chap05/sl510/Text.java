package MingRi.Chap05.sl510;

public class Text { // 创建类
    public static void main(String[] args) { // 主办法
        String str = "We are students"; // 定义字符串
        // 将空字符串在str中的索引位置赋值给变量size
        int size = str.lastIndexOf("");
        // 将变量size输出
        System.out.println("空字符在字符串str中的索引位置是：" + size);
        // 将字符串str的长度输出
        System.out.println("字符串str的长度是：" + str.length());
        System.out.println("字符a在字符串中的位置是：" + str.indexOf("a"));
        System.out.println("字符e在字符串中的最后的位置是：" + str.lastIndexOf("e"));

        String str_cn = "我们是学生。全班有52人。";
        System.out.println("字符串str_cn的长度是：" + str_cn.length());
        System.out.println("字符“学”在字符串中的位置是：" + str_cn.indexOf("学"));
        System.out.println("字符“。”在字符串中的最后的位置是：" + str_cn.lastIndexOf("。"));
    }
}
