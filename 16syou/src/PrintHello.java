/**
 * 問題16-2 「こんにちは！」というあいさつを1秒おきに表示するコード
 */
class LabelPrinter extends Thread {
    String label = "no labe";

    LabelPrinter(String label) {
        this.label = label;
    }

    @Override
    public void run() { //staticを抜いた。
        while (true) {
            System.out.println(label); //「修正」System.out.printlnはtryの外に出した
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("こんにちは！");  //「修正」こんちちわ⇒こんにちは！に変更
        th.start();
    }
}
