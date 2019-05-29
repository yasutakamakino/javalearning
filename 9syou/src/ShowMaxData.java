/**
 * 問題9-7 配列の値の最大値を求めるプログラム
 */
public class ShowMaxData {
    public static void main(String[] args){
        int[] data = { 31,41,59,26,53,58,97,93,23,84};
        int max_data = data[0]; //最大値
        for(int i = 1; i <data.length;i++){
            if(max_data < data[i]){  //今の最大値よりも大きい場合
                max_data=data[i];    //max_dataに値を入れる。
            }
        }
        System.out.println("最大値は"+max_data+"です");
    }
}
