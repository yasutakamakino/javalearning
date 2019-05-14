import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題3-2 2人の年齢の平均を求めるコード
 */
public class ageavr {
    public static void main(String[] args) {
        System.out.println("一人目の名前を入力してください");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name1 = reader.readLine();
            System.out.println(name1 + "さんの年齢を入力してください");
            name1 = reader.readLine();
            int age1 = Integer.parseInt(name1);
            System.out.printf(age1 + "歳\n");

            System.out.println("２人目の名前を入力してください");
            String name2 = reader.readLine();
            System.out.println(name2 + "さんの年齢を入力してください");
            name2 = reader.readLine();
            int age2 = Integer.parseInt(name2);
            System.out.printf(age2 + "歳\n");
            System.out.println(name1 + "と" + name2 + "の年齢の平均は" + (age1 + age2) / 2 + "歳です");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢out");
        }
    }
}

