/**
 * 問16-5<br>
 * list16-1のスレッドの数を1つから３つにした場合
 */
public class CountTen3 extends Thread {

    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {
            new CountTen3().start();
        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("main:i=" + i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((getName()) + ":i=" + i);
        }
    }
}
