/**
 * 問題16-6<br>
 * 約3秒ごといに"***"を10回表示するスレッドと、約5秒ごとに"==="を10回表示する<br>
 * スレッドを、それぞれ１つずつ動かすクラスをThreadクラスの拡張クラスとして<br>
 * 作ってください。
 */

public class Print {
    public static void main(String[] ars) {
        Astar astar = new Astar();
        astar.start();
        Equal equal = new Equal();
        equal.start();
    }
}

class Equal extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(5000);
                System.out.println("=====");
            }
        } catch (InterruptedException e) {
            System.out.println("Equalの方で例外発生");
        }
    }
}

class Astar extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(3000);
                System.out.println("***");
            }
        } catch (InterruptedException e) {
            System.out.println("Astarの方で例外発生");
        }
    }
}
