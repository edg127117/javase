public class playing_card {
    public static void main(String[] args) {
        String[] [] cards=new String[4][13];
        String[] types={"黑桃","红桃","梅花","方块"};
        String[] playCards={"A","k","Q","J","2","3","4","5","6","7","8","9","10"};
        for(int i=0;i<cards.length;i++){
            for(int j=0;j<cards[i].length;j++){
                cards[i][j]=playCards[j]+types[i];
            }
        }
        for(String[] card:cards){
            for(String s:card){
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }
}
