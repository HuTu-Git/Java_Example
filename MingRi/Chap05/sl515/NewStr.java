package MingRi.Chap05.sl515;

public class NewStr { // 创建类
    public static void main(String[] args) { // 主方法
        String str = "address"; // 定义字符串str
        // 字符串str中的字符“a”替换成“A”后返回的新字符串newstr
        String newstr = str.replace("a", "A");
        System.out.println(newstr);

        String str1 = "字符串替换";
        String newstr1 = str1.replace("串", "");
        System.out.println(newstr1);
        String newstr2 = str1.replace("串", "串串");
        System.out.println(newstr2);
    }
}
