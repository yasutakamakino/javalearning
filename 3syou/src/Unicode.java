import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題3-3 文字コードを表示するプログラム
 */
public class Unicode {
    public static void main(String[] args) {
        try {
            System.out.println("名前を入力してください");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            int m = name.length();
            for (int i = 0; i < m; i++) {
                char c = name.charAt(i);
                System.out.println("'" + c + "'の文字コードは" + (int) c + "です");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

