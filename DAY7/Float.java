import java.util.Arrays;

public class Float {
    public static void main(String[] args) {
            double[]x={3.1415,5.6789,4.523,7.658};
            round(x);
           System.out.println(Arrays.toString(x));
    }
    public static void round(double []x){
        for(int i=0; i<x.length; i++){
            x[i]=keep(x[i]);
        }
    }
    public static double keep(double y){
        return (int)(y*100+0.5)/100D;
    }
}
