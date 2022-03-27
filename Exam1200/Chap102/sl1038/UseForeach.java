package Exam1200.Chap102.sl1038;

import java.util.ArrayList;
import java.util.List;

public class UseForeach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); // 创建List集合
        list.add("abc"); // 初始化List集合
        list.add("def");
        list.add("hij");
        list.add("klm");
        list.add("nop");
        list.add("qrs");
        System.out.print("foreach遍历集合：\n");
        for (String string : list) { // 遍历List集合
            System.out.println("\t"+string); // 输出集合的元素值
        }
        System.out.println();
        String[] strs = new String[list.size()]; // 创建数组
        list.toArray(strs);
        System.out.print("foreach遍历数组：\n");
        for (String string : strs) { // 遍历数组
            System.out.println("\t"+string); // 输出数组的元素值
        }
    }
}
