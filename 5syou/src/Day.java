import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-7 数字を入力し、曜日を表示するプログラム
 */
public class Day {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("0～6の数字を入力してください。対応した曜日を表示します。");
            String line = reader.readLine(); //数字を入力
            int i = Integer.parseInt(line);  //int型に変換
            switch (i) {
                case 0:  //入力が0の場合
                    System.out.println("日曜日");
                    break;
                case 1:  //入力が１の場合
                    System.out.println("月曜日");
                    break;
                case 2:  //入力が2の場合
                    System.out.println("火曜日");
                    break;
                case 3:  //入力が3の場合
                    System.out.println("水曜日");
                    break;
                case 4:  //入力が4の場合
                    System.out.println("木曜日");
                    break;
                case 5:  //入力が5の場合
                    System.out.println("金曜日");
                    break;
                case 6:  //入力が6の場合
                    System.out.println("土曜日");
                    break;
                default:  //それ以外の場合
                    System.out.println("0～6の範囲内を入力してください");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        }
    }
}
