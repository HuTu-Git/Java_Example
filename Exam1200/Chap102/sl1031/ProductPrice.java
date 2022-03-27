package Exam1200.Chap102.sl1031;

import java.util.Scanner;

public class ProductPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的消费金额：");
        float money = scan.nextFloat(); // 输入消费金额
        float rebate = 0F; // 折扣
        if (money > 200) {
            int grade = (int) (money / 200); // 等级
            switch (grade) { // 根据等级计算折扣比例
                case 1:
                    rebate = 0.95F;
                    break;
                case 2:
                    rebate = 0.90F;
                    break;
                case 3:
                    rebate = 0.85F;
                case 4:
                    rebate = 0.83F;
                    break;
                case 5:
                    rebate = 0.80F;
                    break;
                case 6:
                    rebate = 0.78F;
                    break;
                case 7:
                    rebate = 0.75F;
                    break;
                case 8:
                    rebate = 0.73F;
                    break;
                case 9:
                    rebate = 0.70F;
                    break;
                case 10:
                    rebate = 0.65F;
                    break;
                default:
                    rebate = 0.60F;
            }
        }
        System.out.println("您的累计消费金额为：" + money); // 输出消费金额
        System.out.println("您将享受" + rebate + "折优惠！"); // 输出折扣比例
        scan.close();
    }
}
