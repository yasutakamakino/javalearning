/**
 * 問題16-6<br>
 * 約3秒ごといに"***"を10回表示するスレッドと、約5秒ごとに"==="を10回表示する<br>
 * スレッドを、それぞれ１つずつ動かすクラスをThreadクラスの拡張クラスとして<br>
 * 作ってください。
 */

public class Print {
    public static void main(String[] ars) {
        new Astar().start(); //「修正」 メソッドの呼び出しの書き方を修正した。
        new Equal().start();
    }
}

class Equal extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //「修正」for文をtry文の前に出した
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Equalで例外発生"); //「修正」"の方"を削除
            }
            System.out.println("====="); //「修正」try文の中から後に位置変更
        }
    }
}

class Astar extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) { //「修正」for文をtry文の前に出した
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Astarで例外発生"); //「修正」"の方"を削除
            }
            System.out.println("***"); //「修正」try文の中から後に位置変更
        }
    }
}
