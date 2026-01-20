package Play;

public class Test {
    public static void main(String[] args) {
        VideCard card = new VideCard("独立显卡",3);
        Computer computer = new Computer("惠普",card);
        Player player=new Player();
        player.setName("李白");
        player.playGame(computer);
    }
}
