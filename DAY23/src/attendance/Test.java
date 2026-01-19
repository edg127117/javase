package attendance;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请选择操作");
        System.out.println("1.生成人员名单");
        System.out.println("2.生成签到表");
        System.out.println("3.生成缺席表");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                List<String> nameList = Until.getNameFromKey();
                Until.write(nameList, "F:/aa/人员名单.txt");
                break;
            case 2:
                List<String> signList = Until.getNameFromKey();
                Until.write(signList, Until.getFileName("F:/aa/", "签到表"));
                break;
            case 3:
                List<String> nameList1 = Until.read("F:/aa/人员名单.txt");
                List<String>signList1 = Until.read(Until.getFileName("F:/aa/", "签到表"));
                nameList1.removeAll(signList1);
                Until.write(nameList1, Until.getFileName("F:/aa/", "缺席表"));
                break;
        }
    }
}
