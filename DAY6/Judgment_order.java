public class Judgment_order {
    public static void main(String[] args) {
        int[] a = {12,23,34,45,56};
        boolean b=true;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]>a[i+1]) {
                b=false;
                break;
            }
        }
        System.out.println(b?"有序":"无序");
    }
}
