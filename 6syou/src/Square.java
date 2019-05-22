/**
 * 問題6-2 2乗のグラフを書くプログラム
 */
public class Square {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < i * i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
