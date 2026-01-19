package Play;

public class VideCard {
    private String type;
    private int rem;

    public VideCard() {
    }

    public VideCard(String type, int rem) {
        this.type = type;
        this.rem = rem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRem() {
        return rem;
    }

    public void setRem(int rem) {
        this.rem = rem;
    }
}
