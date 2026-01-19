package Salary_test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateUtil {
    public static int betweenMonths(LocalDate hireDate) {
        LocalDate now = LocalDate.now();
        long months = ChronoUnit.MONTHS.between(hireDate, now);
        return (int) months;
    }
}
