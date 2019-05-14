/**
 * 問題3-3 文字コードを表示するプログラム
 */
public class Unicode {
    public static void main(String[] args) {
        String name = "結城浩です";
        int m = name.length();
        for (int i = 0; i < m; ++i) {
            char c = name.charAt(i);
            System.out.println(c + "の文字コードは" + (int) c + "です");
        }
    }
}

