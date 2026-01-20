package Playing_card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deal {
    private static List <Card> list;
     static {
         list = new ArrayList<>(54);
        list.add(new Card(1,"大王"));
        list.add(new Card(1,"小王"));
        String[] colors={"黑桃","红桃","梅花","方块"};
        String[] points={"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
        int index=3;
        for(String color:colors){
            for(String point:points){
                list.add(new Card(index++,color+point));
            }
        }
    }
    public static List<Card>getList(){
        return list;
    }
    public static void shuffle() {
        Collections.shuffle(list);
    }
    public static void sendCard(List<Player> players) {
        for (int i = 0; i < list.size()-3; i++) {
            if(i%3==0){
                players.get(0).getCards().add(list.get(i));
            }
            if(i%3==1){
                players.get(1).getCards().add(list.get(i));
            }
            if(i%3==2){
                players.get(2).getCards().add(list.get(i));
            }
        }
       players.get(3).getCards().addAll(list.subList(list.size()-3, list.size()));
       for (Player player : players) {
            Collections.sort(player.getCards(),new Comparator<Card>() {
                @Override
                public int compare(Card o1, Card o2) {
                    return Integer.compare(o1.getIndex(),o2.getIndex());
                }
            });
       }
    }
    public static void main(String[] args) {
        List<Card> list = getList();
        for(Card card:list){
            System.out.println(card+"\t");
        }
        shuffle();
        for(Card card:list){
            System.out.println(card+"\t");
        }
    }
}
