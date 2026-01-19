public class ChargeSystem {
    public void charge(Car car) {
        String type = car.getType();
        int time=getTime(car);
        int x=time/60;
        int y=time%60;
        if (type.equals("小型车")) {
            if (time <= 60) {
                System.out.println(car.getNum()+"需要缴费8元");
            }else {
                if(y!=0){
                    int p=(x+1-1)*5+8;
                    System.out.println(car.getNum()+"需要缴费"+p+"元");
                }else{
                    int p=(x-1)*5+8;
                    System.out.println(car.getNum()+"需要缴费"+p+"元");
                }
            }
        }else{
            if (time <= 60) {
                System.out.println(car.getNum()+"需要缴费15元");
            }else {
                if(y!=0){
                    int p=(x+1-1)*8+15;
                    System.out.println(car.getNum()+"需要缴费"+p+"元");
                }else{
                    int p=(x-1)*8+15;
                    System.out.println(car.getNum()+"需要缴费"+p+"元");
                }
            }
        }
    }
    public int getTime(Car car) {
        int inHour = car.getInHour();
        int inMinute = car.getInMinute();
        int outHour = car.getOutHour();
        int outMinute = car.getOutMinute();
        int inTime=inHour*60+inMinute;
        int outTime=outHour*60+outMinute;
        return inTime-outTime;
    }
}
