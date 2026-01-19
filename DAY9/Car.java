public class Car {
    private String brand;
    private double displacement;

    public Car() {
    }

    public Car(String brand, double displacement) {
        this.brand = brand;
        this.displacement = displacement;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}
