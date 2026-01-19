package Metro;

import java.util.LinkedHashMap;
import java.util.Map;

public class Site {
    private static Map<String,Integer> siteMap;
    static {
        siteMap=new LinkedHashMap<String,Integer>();
        siteMap.put("沿山大道站",1);
        siteMap.put("凤凰山站",2);
        siteMap.put("文德路站",3);
        siteMap.put("河滨公园站",4);
        siteMap.put("康安路站",5);
        siteMap.put("南京工业大学站",6);
        siteMap.put("兴隆路站",7);
        siteMap.put("万寿路站",8);
        siteMap.put("国际健康中心站",9);
    }
    public static int calc(String start,String end){
        Integer StartIndex=siteMap.get(start);
        Integer EndIndex=siteMap.get(end);
        if (StartIndex==-1 || EndIndex==-1){
            return -1;
        }else {
            return Math.abs(EndIndex-StartIndex);
        }
    }
}
