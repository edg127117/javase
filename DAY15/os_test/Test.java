package Os_test;

public class Test {
    public static void main(String[] args) {
        String property = System.getProperty("os.name");
        property = property.substring(0,property.indexOf(" ")).toUpperCase();
        switch (Os_Enum.valueOf(property)) {
            case WINDOWS:
                System.out.println("推荐使用IE浏览器");
                break;
            case LINUX:
                System.out.println("推荐使用Chrome浏览器");
                break;
        }
    }
}
