package MingRi.Chap04.xt402;

public class XiTi402 {
    public static void main(String[] args) {
        int cengshu = 9; // 定义菱形的层数，要求层数必须为奇数
        int shangceng = (cengshu + 1) / 2; // 定义菱形上半层的层数
        for (int i = 1; i <= shangceng; i++) {
            for (int space = i; space <= shangceng - 1; space++) {
                System.out.print("  "); // 输出空格
            }
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("* "); // 输出星号
            }
            System.out.println();
        }
        int xiaceng = cengshu - shangceng; // 定义菱形下半层的层数
        for (int i = xiaceng; i >= 1; i--) {
            for (int space = 1; space <= xiaceng + 1 - i; space++) {
                System.out.print("  "); // 输出空格
            }
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("* "); // 输出星号
            }
            System.out.println();
        }
    }
}
