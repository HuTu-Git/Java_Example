package Exam1200.Chap102.sl1025;

import java.math.BigDecimal;

public class AccuratelyFloat {
    public static void main(String[] args) {
        double money = 2; // 现有金额
        double price = 1.1; // 商品价格
        double result = money - price;
        System.out.println("非精确计算：");
        System.out.println("剩余金额：" + result); // 输出运算结果
        // 精确浮点数的解决方法
        BigDecimal money1 = new BigDecimal("2"); // 现有金额
        BigDecimal price1 = new BigDecimal("1.1"); // 商品单价
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("精确计算：");
        System.out.println("剩余金额：" + result1); // 输出精确结果

        // 数值计算
        double x = 2;
        double y = 1.1;
        double he = x + y;
        double cha = x - y;
        double ji = x * y;
        double shang = y / x;
        System.out.println("非精确计算：");
        System.out.println(x + " + " + y + " = " + he);
        System.out.println(x + " - " + y + " = " + cha);
        System.out.println(x + " * " + y + " = " + ji);
        System.out.println(y + " / " + x + " = " + shang);
        // 精确浮点数的解决方法
        BigDecimal x1 = new BigDecimal("2");
        BigDecimal y1 = new BigDecimal("1.1");
        BigDecimal he1 = x1.add(y1);
        BigDecimal cha1 = x1.subtract(y1);
        BigDecimal ji1 = x1.multiply(y1);
        BigDecimal shang1 = y1.divide(x1);
        System.out.println("精确计算：");
        System.out.println(x1 + " + " + y1 + " = " + he1);
        System.out.println(x1 + " - " + y1 + " = " + cha1);
        System.out.println(x1 + " * " + y1 + " = " + ji1);
        System.out.println(y1 + " / " + x1 + " = " + shang1);
    }
}
