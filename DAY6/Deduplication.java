import java.util.Arrays;

public class Deduplication {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,2,1,3,5,6,9,5};
        int sum=0;
        for(int i=0;i<x.length;i++) {
            for(int j=i+1;j<x.length;j++) {
                if (x[i]==x[j]) {
                    sum++;
                }
            }
        }
        //System.out.println(sum);
        int[] y = new int[x.length-sum];
        int m=0;
        for(int i=0;i<x.length;i++) {
            boolean b=true;
            for(int j=i+1;j<x.length;j++) {
                if (x[i]==x[j]) {
                    b=false;
                    break;
                }
            }
            if (b){
                y[m++]=x[i];
            }

        }
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));
    }
}
