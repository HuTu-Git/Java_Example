package MingRi.Chap04.sl414;

public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == 6) { // 如果i等于6，则跳出循环
                break;
            }
        }
        System.out.println("---End---");
    }
}
