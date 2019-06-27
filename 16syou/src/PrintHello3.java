/**
 * 問16-3　<br>
 * 問16-2を用いて「おはよう！」、「こんにちは！」、「こんばんは！」<br>
 * をそれぞれ表示するスレッド3つを動かすクラスprintHello3を宣言してください<br>
 */
// 「修正」 コメントの「こんにちわ！」⇒「こんにちは！」、「こんばんわ！」⇒「こんばんわ！」に変更
public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter mh = new LabelPrinter("おはよう！");
        LabelPrinter ah = new LabelPrinter("こんにちは！");
        LabelPrinter nh = new LabelPrinter("こんばんは！");
        mh.start();
        ah.start();
        nh.start();
    }
}
