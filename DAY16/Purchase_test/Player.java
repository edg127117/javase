package Purchase_test;

import java.time.LocalDate;

public class Player {
    private String name;
    private LocalDate buyDate;

    public Player(String name, LocalDate buyDate) {
        this.name = name;
        this.buyDate = buyDate;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }
}
