import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

/**
 * 問18-2 ファイル中に特定の文字列を含んでいるかどうかを調べるプログラム
 */
public class FindFile1 {
    public static void main(String[] args) {
        if (args.length !=2) {  //「修正」1⇒２に変更
            System.out.println("使用法:Java FindFile1 検索文字列  検索対象ファイル");  //「修正」FindFile1に変更
            System.out.println("例:java FindFind1 System FindFile1.java"); //「修正」FindFile1に変更cd
            System.exit(0);
        }
        String keyword = args[0];
        String filename = args[1];
        System.out.println("検索文字列は「" + keyword + "」です。");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename)); //「修正」tryの中に移動
            String r_line;
            int i = 1;
            while ((r_line = reader.readLine()) != null) {
                if (r_line.contains(keyword)) {
                    System.out.println(i + ":" + r_line);
                }
                i++;
            }
            reader.close();
        } catch (FileSystemNotFoundException e) { //「修正」  ファイルが開けなかった場合の例外処理を追加
            System.out.println("ファイルが見つかりません" + e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
