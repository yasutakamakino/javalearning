/**
 * 問題16-7<br>
 * 問題16-6のクラスを、Runnableインターフェスを実装して作ってください。
 */
//「修正」　Runnaable⇒Runnableに変更
public class Print_1 {
    public static void main(String[] ars) {
        new Thread(new Equal_1()).start(); //「修正」 メソッドの呼び出しの書き方を修正した。
        new Thread(new Astar_1()).start();
    }
}

//***を出力するスレッド
class Astar_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //「修正」for文をtry文の前に出した
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Astar_1で例外発生"); //「修正」"の方"を削除
            }
            System.out.println("***"); //「修正」try文の中から後に位置変更
        }
    }
}

//=====を出力するスレッド
class Equal_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //「修正」for文をtry文の前に出した
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Equal_1で例外発生"); //「修正」"の方"を削除
            }
            System.out.println("=====");  //「修正」try文の中から後に位置変更
        }
    }
}
