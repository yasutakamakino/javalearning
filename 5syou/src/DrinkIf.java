import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-6 入力された文字列に応じて、飲み物を表示するするプログラム
 */
public class DrinkIf {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("あ＝オレンジジュース");
            System.out.println("い＝コーヒー");
            System.out.println("あ、いのどれかを選んでください。");
            String line = reader.readLine();
            char c = line.charAt(0);
            //if文からswitch文に修正
            switch (c) {
                case 'あ':       //"い”を入力した場合
                    System.out.println("オレンジジュースです。");
                    break;
                case 'い':       //"あ”を入力した場合
                    System.out.println("コーヒーです。");
                    break;
                default:         //"それ以外の場合
                    System.out.println("どちらでもありません。");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
