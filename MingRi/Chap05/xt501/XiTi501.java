package MingRi.Chap05.xt501;

import java.util.Scanner;

public class XiTi501 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串：");
        String line = scan.nextLine();
        System.out.println("转换大写为：" + line.toUpperCase());
        System.out.println("转换小写为：" + line.toLowerCase());
        scan.close();
    }

}
