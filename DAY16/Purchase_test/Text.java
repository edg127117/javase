package Purchase_test;

import java.time.LocalDate;

public class Text {
    public static void main(String[] args) {
        int d=1788;
        Player p1 = new Player("李白", LocalDate.of(2022,9,5));
        Player p2 = new Player("李信", LocalDate.of(2022,9,10));
        Player p3 = new Player("白起", LocalDate.of(2022,9,28));
        Player p4 = new Player("李元芳", LocalDate.of(2022,10,10));
        Player [] players = new Player[4];
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
        doBuySkin(players);
    }
    public static void doBuySkin(Player [] players) {
        int d=1788;
        LocalDate onLineDate = LocalDate.of(2022,9,2);
        Game game = new Game();
        for (Player player : players) {
            int x= game.buy(onLineDate,player.getBuyDate());
            if(x==-1) {
                System.out.println("皮肤已经下架，"+player.getName()+"无法在"+player.getBuyDate()+"时间购买");
            }else {
                System.out.println(player.getName() + "在" + player.getBuyDate() + "购买,花费" + x * 0.1 * 1788 + "点卷");
            }
        }
    }
}
