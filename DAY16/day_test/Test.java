package Day_test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2002,12,7);
        LocalDate date2= LocalDate.now();
        long diff = ChronoUnit.DAYS.between(date1,date2);
        System.out.println(diff);
    }
}
