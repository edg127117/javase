package lottery;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择彩票类型 3D或5D");
        int t=sc.nextInt();
        System.out.println("请输入购买数量:");
        int z=sc.nextInt();
        List<List<String>> list=getNumber(t,z);
        String time=getTime();
        String code=getNo();
        BufferedWriter writer=new BufferedWriter(new FileWriter("F:/aa/彩票.txt"));
        writer.write("购买时间:"+time);
        writer.newLine();
        writer.write("流水号码:NO."+code);
        writer.newLine();
        writer.write("彩票号码:");
        writer.newLine();
        list.forEach(list1->{
            list1.stream().sorted().forEach(x->{
                try {
                    writer.write(x+"\t");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            try {
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }

    public static List<List<String>> getNumber(int t, int z) {
        Random random = new Random();
        List<List<String>> list = new ArrayList<>(z);
        for (int i = 0; i < z; i++) {
            List<String> subList = new ArrayList<>(t);
            for (int i1 = 0; i1< t; i1++) {
                subList.add("0" + (random.nextInt(9) + 1));
            }
            list.add(subList);
        }
        return list;
    }

    public static String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }

    public static String getNo() {
        Random random=new Random();
        StringBuffer str=new StringBuffer();
        for (int i=1;i<=10;i++){
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
