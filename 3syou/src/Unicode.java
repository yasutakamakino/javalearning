import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題3-3 文字コードを表示するプログラム
 */
public class Unicode {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("名前を入力してください");
            String name = reader.readLine();                                                                            //名前を入力
            int m = name.length();                                                                                      //名前の文字数を取得
            //名前の各文字の文字コードを表示
            for (int i = 0; i < m; i++) {
                char c = name.charAt(i);                                                                                //指定された場所の文字を取得
                System.out.println("'" + c + "' の文字コードは "+ (int) c + " です。");                                 //結果を表示する
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

