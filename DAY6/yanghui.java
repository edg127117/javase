public class yanghui {
    public static void main(String[] args) {
        int[][] y=new int[10][];
        for(int i=0;i< y.length;i++){
            y[i]=new int[i+1];
        }
        for(int i=0;i< y.length;i++){
            for(int j=0;j< y[i].length;j++){
                if(j==0 || j==i){
                    y[i][j]=1;
                }else {
                    y[i][j]=y[i-1][j-1]+y[i-1][j];
                }
            }
        }
        for (int[] a : y) {
            for (int i : a) {
                System.out.print(i+"\t");
            }
            System.out.println();
            
        }
    }
}
