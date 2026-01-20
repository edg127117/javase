package Nw;

public class God {
    public static Person makePerson(String gender) {
        if("男".equals(gender)) {
            return new Male();
        }else {
            return new FeMale();
        }
    }
}
