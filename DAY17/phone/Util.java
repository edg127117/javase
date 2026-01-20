package Phone;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Util {
    public static String getPhoneNumber(Random random) {
        String prefix="1";
        List<String> list1= Arrays.asList("3","5","7","8","9");
        int index = random.nextInt(list1.size());
        return prefix + list1.get(index) + getSuffix(random);
    }
    private static String getSuffix(Random random) {

        String suffix = "";
        for (int i = 0; i < 9; i++) {
            suffix += random.nextInt(10);
        }
        return suffix;
    }


}
