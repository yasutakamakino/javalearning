/**
 * 問題9-8　配列に入っている値を昇順に並べるプログラム
 */
public class SortData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        //並べ帰る前の値の列を表示
        System.out.println("並べ替える前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(" ");
        //昇順に並べ替える処理
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {

                if (data[i] > data[j]) {
                    int x = 0;
                    x = data[i];
                    data[i] = data[j];
                    data[j] = x;
                }
            }
        }
        //昇順に並べ替えた後の値の列の表示
        System.out.println("並べ替えた後");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
