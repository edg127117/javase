public class Test01 {
    public static void main(String[] args) {
         Parking parking = new Parking();

         Car car=parking.getCar();
         ChargeSystem chargeSystem = new ChargeSystem();
         chargeSystem.charge(car);
    }
}
