package MingRi.Chap05.xt503;

import java.util.Scanner;

public class XiTi503 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String photonumber = scan.nextLine();
        String regex = "1[35789]\\d{9}";
        if (photonumber.matches(regex)) {
            System.out.println(photonumber + "是合法的手机号");
        } else {
            System.out.println(photonumber + "不是合法的手机号");
        }
        scan.close();
    }
}
