/**
 *問題8-2 以下のような放物線を描くプログラム<br>
 * <pre>
 * ****************************************************************
 * *************************************************
 * ************************************
 * *************************
 * ****************
 * *********
 * ****
 * *
 *
 * *
 * ****
 * *********
 * ****************
 * *************************
 * ************************************
 * *************************************************
 * ****************************************************************
 * </pre>
 */
public class Graph1 {
    public static void main(String[] args){
        for(int i = -8 ;i < 9 ; i++){
            printGraph(i*i);
        }
    }
    /**
     * printGraphメソッド<br>
     * 引数の数だけ"*"を出力する
     * @param x 1行あたりの"*"を表示する数
     */
    public static void printGraph(int x){
        for(int i =0 ;i < x ;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
