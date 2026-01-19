import java.util.Scanner;

public class Filter_Test {
    public static void main(String[] args) {
        String[] filters={"台湾省","日本","美国"};
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入聊天内容");
        String filter=sc.nextLine();
        filter=filter.replace(" ","");
        for(String s:filters){
            filter=filter.replace(s,getStr(s));
        }
        System.out.println("你的聊天是");
        System.out.println(filter);
    }
    public static String getStr(String str){
        int len=str.length();
        StringBuffer star=new StringBuffer();
        for(int i=0;i<len;i++){
            star.append("*");
        }
        return star.toString();
    }
}
