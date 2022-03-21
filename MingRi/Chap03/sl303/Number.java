package MingRi.Chap03.sl303;

public class Number { // 创建类
    public static void main(String[] args) { // 主方法
        byte mybyte = 124; // 声明byte型变量并赋值
        short myshort = 32564; // 声明short型变量并赋值
        int myint = 45784612; // 声明int型变量并赋值
        long mylong = 46789451; // 声明long型变量并赋值
        long result = mybyte + myshort + myint + mylong; // 获得各数相加后的结果
        System.out.println("结果为：" + result); // 将以上变量相加的结果输出

        // 输出byte类型的最小值和最大值
        byte byte_min = Byte.MIN_VALUE; // 获得byte类型的最小值
        byte byte_max = Byte.MAX_VALUE; // 获得byte类型的最大值
        // 超过byte类型取值范围，需强制类型转换或改为int类型；否则报错
        byte byte_min_dec1 = (byte) (byte_min - 1); // 结果错误
        // int byte_min_dec1 = byte_min - 1; // 结果正确
        // 超过byte类型取值范围，需强制类型转换或改为int类型；否则报错
        // int byte_max_add1 = byte_max + 1;
        byte byte_max_add1 = (byte) (byte_max + 1);
        System.out.println("byte类型的最小值是：" + byte_min);
        System.out.println("byte类型的最大值是：" + byte_max);
        System.out.println("byte类型的最小值减1后的结果是：" + byte_min_dec1);
        System.out.println("byte类型的最大值加1后的结果是：" + byte_max_add1);

        // 输出short类型的最小值和最大值
        short short_min = Short.MIN_VALUE; // 获得short类型的最小值
        short short_max = Short.MAX_VALUE; // 获得short类型的最大值
        // 超过short类型取值范围，需强制类型转换或改为int类型（结果正确）；否则报错
        // short short_min_dec1 = (short) (short_min - 1); // 结果错误
        int short_min_dec1 = short_min - 1; // 结果正确
        // 超过short类型取值范围，需强制类型转换或改为int类型（结果正确）；否则报错
        // short short_max_add1 = (short) (short_max + 1); // 结果错误
        int short_max_add1 = short_max + 1; // 结果正确
        System.out.println("short类型的最小值是：" + short_min);
        System.out.println("short类型的最大值是：" + short_max);
        System.out.println("short类型的最小值减1后的结果是：" + short_min_dec1);
        System.out.println("short类型的最大值加1后的结果是：" + short_max_add1);

        // 输出int类型的最小值和最大值
        int int_min = Integer.MIN_VALUE; // 获得int类型的最小值
        int int_max = Integer.MAX_VALUE; // 获得int类型的最大值
        // 超过int类型取值范围不报错，结果错误或强制类型转换改为long类型（结果正确）
        int int_min_dec1 = int_min - 1; // 结果错误
        // long int_min_dec1 = (long) int_min - 1; // 结果正确
        int int_max_add1 = int_max + 1; // 结果错误
        // long int_max_add1 = (long) int_max + 1; // 结果正确
        System.out.println("int类型的最小值是：" + int_min);
        System.out.println("int类型的最大值是：" + int_max);
        System.out.println("int类型的最小值减1后的结果是：" + int_min_dec1);
        System.out.println("int类型的最大值加1后的结果是：" + int_max_add1);

        // 输出long类型的最小值和最大值
        long long_min = Long.MIN_VALUE; // 获得long类型的最小值
        long long_max = Long.MAX_VALUE; // 获得long类型的最大值
        // 超过long类型取值范围不报错，结果错误
        long long_min_dec1 = long_min - 1;
        long long_max_add1 = long_max + 1;
        System.out.println("long类型的最小值是：" + long_min);
        System.out.println("long类型的最大值是：" + long_max);
        System.out.println("long类型的最小值减1后的结果是：" + long_min_dec1);
        System.out.println("long类型的最大值加1后的结果是：" + long_max_add1);

        // 输出float类型的最小值和最大值
        float float_min = Float.MIN_VALUE; // 获得float类型的最小值
        float float_max = Float.MAX_VALUE; // 获得float类型的最大值
        System.out.println("float类型的最小值是：" + float_min);
        System.out.println("float类型的最大值是：" + float_max);

        // 输出double类型的最小值和最大值
        double double_min=Double.MIN_VALUE; // 获得double类型的最小值
        double double_max=Double.MAX_VALUE; // 获得double类型的最大值
        System.out.println("double类型的最小值是：" + double_min);
        System.out.println("double类型的最大值是：" + double_max);
    }
}
