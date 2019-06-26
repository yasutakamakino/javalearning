/**
 * 問題16-7<br>
 * 問題16-6のクラスを、Runnaableインターフェスを実装して作ってください。
 */
public class Print_1 {
    public static void main(String[] ars) {
        Equal_1 a = new Equal_1();
        Thread th = new Thread(a);
        Astar_1 b = new Astar_1();
        Thread sh = new Thread(b);
        th.start();
        sh.start();
    }
}

//***を出力するスレッド
class Astar_1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(3000);
                System.out.println("***");
            }
        } catch (InterruptedException e) {
            System.out.println("Astar_1の方で例外発生");
        }
    }
}

//=====を出力するスレッド
class Equal_1 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("=====");
            }
        } catch (InterruptedException e) {
            System.out.println("Equal_1の方で例外発生");
        }
    }
}
