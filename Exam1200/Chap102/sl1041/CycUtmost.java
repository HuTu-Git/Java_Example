package Exam1200.Chap102.sl1041;

public class CycUtmost {
    public static void main(String[] args) {
        int end = Integer.MAX_VALUE; // 定义循环终止数
        int start = end - 50; // 定义循环起始数
        int count = 0; // 定义循环计数器
        for (int i = start; i <= end; i++) { // 执行循环
            count++; // 循环计数
            System.out.println("第" + count + "次循环");
        }
        System.out.println("本次循环次数为：" + count);
    }
}
