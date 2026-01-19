public class Teat {
    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen();
        Car[] cars =volkswagen.organize();
        TaxDept taxDept = new TaxDept();
        taxDept.tax(cars);
    }
}
