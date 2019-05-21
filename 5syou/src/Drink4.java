import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 問題5-8　リターンキーを押してもエラー表示を防ぐプログラム
 */
public class Drink4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("a オレンジジュース");
            System.out.println("b コーヒー");
            System.out.println("c どちらでもない");
            System.out.println("a,b,cのどれかを選んでください。");
            String line = reader.readLine();
            char c;
            //リターンキーを押した時の処理
            if (line.length () > 0) { //文字を入力した場合
                c = line.charAt(0);
            } else {                  //それ以外の場合(Enterキーを押したときの処理）
                c = 'c';
            }
            //switch文の処理
            switch (c) {
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;
                case 'b':
                    System.out.println("コーヒーです。");
                    break;
                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
