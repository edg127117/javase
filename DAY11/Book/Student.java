package Book;

public class Student {
    private String name;
    private BookCard card;

    public BookCard getCard() {
        return card;
    }

    public void setCard(BookCard card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
