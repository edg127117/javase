package Play;

public class Computer {
    private String brand;
    private VideCard videCard;

    public Computer() {
    }

    public Computer(String brand, VideCard videCard) {
        this.brand = brand;
        this.videCard = videCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VideCard getVideCard() {
        return videCard;
    }

    public void setVideCard(VideCard videCard) {
        this.videCard = videCard;
    }
}
