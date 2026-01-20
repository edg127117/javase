package Play;

public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playGame(Computer computer) {
        VideCard card = computer.getVideCard();
        if ("独立显卡".equals(card.getType())) {
            System.out.println(name+"可以玩游戏");
        }else{
            System.out.println(name+"不可以玩游戏");
        }
    }
}
