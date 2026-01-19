import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Base {
    private static List<Staff> staffList;
    static {
        staffList=new ArrayList <>(6);
        staffList.add(new Staff("Y1012","李白","男",29,12000,
                "研发部", LocalDate.of(2016,10,10)));
        staffList.add(new Staff("C2404","杜甫","男",28,14000,
                "产品部",LocalDate.of(2017,9,5)));
        staffList.add(new Staff("Y1035","白居易","男",27,11000,
                "研发部",LocalDate.of(2018,5,21)));
        staffList.add(new Staff("Y1089","李商隐","男",29,15000,
                "研发部",LocalDate.of(2016,3,19)));
        staffList.add(new Staff("C2675","李清照","女",24,8000,
                "产品部",LocalDate.of(2021,7,16)));
        staffList.add(new Staff("X3021","陆游","男",32,18000,
                "项目部",LocalDate.of(2014,12,20)));

    }
    public static List<Staff> getStaffList() {
        return staffList;
    }
}
