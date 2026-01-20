package Playing_card;

import java.util.ArrayList;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<Player> list = new ArrayList<>();
        list.add(new Player("李白",new ArrayList<>()));
        list.add(new Player("杜甫",new ArrayList<>()));
        list.add(new Player("白居易",new ArrayList<>()));
        list.add(new Player("底牌",new ArrayList<>()));
        Deal.sendCard(list);
        for (Player player : list) {
            System.out.println("玩家："+player.getName());
            List<Card> cards = player.getCards();
            System.out.println(cards);
        }
    }
}
