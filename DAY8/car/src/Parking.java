import java.util.Scanner;

public class Parking {
    public Car getCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请扫描车牌号码");
        String num = sc.next();
        System.out.println("车辆类型");
        String type = sc.next();
        System.out.println("驶入时间");
        int inHour = Integer.parseInt(sc.next());
        int inMinute = Integer.parseInt(sc.next());
        System.out.println("驶出时间");
        int outHour = Integer.parseInt(sc.next());
        int outMinute = Integer.parseInt(sc.next());
        return new Car(num,type, inHour, inMinute,  outHour, outMinute);
    }
}
