import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-5 以下のswich文をif文で書き変えてください。<br>
 * <pre>{@code
 * swicth(c){
 *  case '1':
 *  case 'a':
 *      System.out.println("オレンジジュースです。");
 *      break;
 *  case '2':
 *  case 'b':
 *      System.out.println("コーヒーです。");
 *      break;
 *  default:
 *      System.out.println("どちらでもありません");
 *      break;
 * }
 * }<pre/>
 */
public class Drink2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1 or a オレンジジュース");
            System.out.println("2 or b コーヒー");
            System.out.println("どれかを選んでください。");
            String line = reader.readLine();                         //指定された文字または数字を入力
            char i = line.charAt(0);                                 //一文字だけを取得
            //ここから修正した部分
            if (i == '1' || i == 'a') {              // 1 or a　の場合
                System.out.println("オレンジジュースです。");
            } else if (i == '2' || i == 'b') {       // 2 or b　の場合
                System.out.println("コーヒーです。");
            } else {                                 //それ以外の場合
                System.out.println("どちらでもありません。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
