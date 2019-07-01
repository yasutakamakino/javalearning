import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 問18-3<br>
 * List18-9は、ファイルの名前を指定すると、そのファイルに1000より小さい素数の表を書きだすプログラムですが<br>
 * まだ作りかけです。<br>
 * java Prime1 prime.txt <br>
 * のように実行すると、prime.txtの内容はFig.18-15のようになる予定です。このプログラムを完成させてください。
 */
public class Prime1 {
    static final int MAX_PRIME = 1000; //MAX_PRIMEの値を宣言 //「修正」位置を先頭に移動

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法；java Prime 作成ファイル");
            System.out.println("例:java Prime1 prime.txt");
            System.exit(0);
        }
        String filename = args[0];

        //try-catch文を加えた。
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            writePrime(writer);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void writePrime(PrintWriter writer) {
        boolean[] prime = new boolean[MAX_PRIME];
        for (int n = 0; n < MAX_PRIME; n++) {
            prime[n] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int n = 0; n < MAX_PRIME; n++) {
            if (prime[n]) {
                writer.println(n); //write.println(n)を追加
                for (int i = 2; i * n < MAX_PRIME; i++) {
                    prime[i * n] = false;
                }
            }
        }
    }
}
