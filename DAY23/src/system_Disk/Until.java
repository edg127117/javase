package system_Disk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Until {
    public static String format(long timestamp){
        Date date = new Date(timestamp);
        return new SimpleDateFormat("yyyy/MM/dd HH:mm").format(date);
    }
}
