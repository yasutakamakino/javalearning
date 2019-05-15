import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題3-2 2人の年齢の平均を求めるコード
 */
public class AgeAvr {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 一人目の処理
            System.out.println("一人目の名前を入力してください");
            String name1 = reader.readLine();                                                                           //一人目の 名前を入力
            System.out.println(name1 + "さんの年齢を入力してください");
            String line = reader.readLine();                                                                            //一人目の年齢を入力
            int age1 = Integer.parseInt(line);                                                                          //String型をint型に変換
            System.out.printf(age1 + "歳\n");
            //二人目の処理
            System.out.println("２人目の名前を入力してください");
            String name2 = reader.readLine();                                                                           //二人目の名前を入力
            System.out.println(name2 + "さんの年齢を入力してください");
            line = reader.readLine();                                                                                   //二人目の年齢を入力
            int age2 = Integer.parseInt(line);                                                                          //String型をint型に変換
            System.out.printf(age2 + "歳\n");
            //平均値の計算
            System.out.println(name1 + "と" + name2 + "の年齢の平均は" + (age1 + age2) / 2 + "歳です");                 //計算の表示
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }
    }
}

