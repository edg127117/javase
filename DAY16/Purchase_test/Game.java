package Purchase_test;

import java.time.LocalDate;

public class Game {
    public int buy(LocalDate onLineDate,LocalDate buyDate) {
        LocalDate week1 = onLineDate.plusDays(7);
        LocalDate week2 = onLineDate.plusDays(14);
        LocalDate week3 = onLineDate.plusDays(28);
        int i= buyDate.compareTo(week1);
        if (i<=0){
            return 8;
        }else {
            int j= buyDate.compareTo(week2);
            if (j<=0){
                return 9;
            }else {
                int m= buyDate.compareTo(week3);
                if (m<=0){
                    return 10;
                }else{
                    return -1;
                }
            }
        }
    }
}
