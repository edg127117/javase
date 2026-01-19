package Playing_card;

public class Card {
    private int index;
    private String value;

    public Card(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public Card() {
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value;
    }

}
