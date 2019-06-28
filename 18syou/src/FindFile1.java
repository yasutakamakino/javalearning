import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問18-2 ファイル中に特定の文字列を含んでいるかどうかを調べるプログラム
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用方:Java Find1 検索文字列 < 検索対象ファイル");
            System.out.println("例:java Find1 System < Find1.java");
            System.exit(0);
        }
        String keyword = args[0];
        System.out.println("検索文字列は「" + keyword + "」です。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String r_line;
            int i = 1;
            while ((r_line = reader.readLine()) != null) {
                if (r_line.contains(keyword)) {
                    System.out.println(i + ":" + r_line);
                    //読み込みファイルを閉じる
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
