package MingRi.Chap04.xt403;

public class XiTi403 {
    public static void main(String[] args) {
        double sum = 0; // 定义和变量并赋值
        double jiecheng = 1; // 定义阶乘倒数变量
        int i = 1;
        while (i <= 20) {
            sum = sum + jiecheng;
            i++;
            jiecheng = jiecheng * 1 / i;
        }
        System.out.println("1+1/2!+1/3!+...+1/20!的值为：" + sum);
    }
}
