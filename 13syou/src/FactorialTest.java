/**
 * 問13-4 再帰を使って10の階乗を求めるプログラム
 */
public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    //再帰で10の階乗を求めるメソッド
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
