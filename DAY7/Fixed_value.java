public class Fixed_value {
    public static void main(String[] args) {
        int[]y={1,2,3,4,5,6,7,8,9};
        boolean b=exists(3,y);
        System.out.println("b="+b);
    }
    public static boolean exists(int x , int []y){
        for (int i : y) {
            if(x==i){
                return true;
            }
        }
        return false;
    }
}
