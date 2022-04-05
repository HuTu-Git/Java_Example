package MingRi.Chap05.xt504;

public class XiTi504 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        int i;
        for (i = 1; i <= 10; i++) {
            str.append(i);
        }
        System.out.println(str.toString() + " " + i);
        System.out.println(str + " " + i);
    }
}
