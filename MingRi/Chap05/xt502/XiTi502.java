package MingRi.Chap05.xt502;

import java.util.Scanner;

public class XiTi502 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入第一个英文字符串（长度大于5）：");
        String line1 = scan1.nextLine();
        System.out.println("请输入第二个英文字符串（长度大于5）：");
        String line2 = scan2.nextLine();
        String substr1 = line1.substring(1, 4);
        String substr2 = line2.substring(1, 4);
        if (substr1.equals(substr2)) {
            System.out.println("两个子串相同");
        } else {
            System.out.println("两个子串并不相同");
        }
        scan1.close();
        scan2.close();
    }
}
