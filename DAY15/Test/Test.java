package Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入数字：");
        String str = sc.next();
        String[] strs = str.split(",");
        for (String s : strs) {
            BigDecimal d = new BigDecimal(s);
            BigDecimal x = d.multiply(new BigDecimal(10))
                    .divide(new BigDecimal(1),2, RoundingMode.HALF_UP);
            System.out.println(x);
        }


    }
}
