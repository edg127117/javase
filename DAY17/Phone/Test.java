package Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(1000);
        Random random=new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(Util.getPhoneNumber(random));
        }
        List<String> list1=new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            int index=random.nextInt(list.size());
            list1.add(list.get(index));
        }
        for (ListIterator<String> iterator = list1.listIterator(); iterator.hasNext();){
            iterator.set(new StringBuffer(iterator.next()).
                    replace(3,7,"****").toString());
        }
        for (String s : list1) {
            System.out.println(s);
        }
    }

}
