public class TaxDept {
    public void  tax(Car[] cars) {
        int total = 0;
        for (Car car : cars) {
            double dis= car.getDisplacement();
            String brand= car.getBrand();
            if(dis<=1.0) {
                System.out.println(brand + "收取360元");
                total+=360;
            }else if(dis<=1.6) {
                System.out.println(brand + "收取420元");
                total += 420;
            }else if(dis<=2.0) {
                System.out.println(brand + "收取540元");
                total += 540;
            }else if(dis<=2.5) {
                System.out.println(brand + "收取800元");
                total += 800;
            }else if(dis<=3.0) {
                System.out.println(brand + "收取1800元");
                total += 1800;
            } else if(dis<=4.0) {
                System.out.println(brand + "收取2800元");
                total += 2800;
            }else {
                System.out.println(brand + "收取3600元");
                total += 3600;
            }
        }
        System.out.println("税务局一共收取了"+total);
    }
}
