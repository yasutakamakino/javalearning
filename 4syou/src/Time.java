import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題4-3　時刻を入力して、それに応じて挨拶を表示する。
 */
public class Time {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.println("現在の時刻を入力してください");
            String buf = br.readLine();           //時刻を入力
            int hour = Integer.parseInt(buf);     // int型に変換
            if (0 <= hour && hour <= 11) {        //0時から11時の間の場合
                System.out.println("おはようございます");
            } else if (hour == 12) {              //12時の場合
                System.out.println("お昼です");
            } else if (13 <= hour && hour <= 18) {              //13時から18時の間の場合
                System.out.println("こんにちは");
            } else if (19 <= hour && hour <= 23) {              //19時から23時の間の場合
                System.out.println("こんばんは");
            } else {                              //それ以外の場合
                System.out.println("時刻の範囲を超えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
}

