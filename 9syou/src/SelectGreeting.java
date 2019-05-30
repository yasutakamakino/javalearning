/**
 * 問題9-6 コマンドラインの引数を用いて挨拶を表示するプログラム
 */
public class SelectGreeting {
    public static void main(String[] args) {
        String[] message;
        message = new String[3];
        message[0] = "おはよう!";
        message[1] = "こんにちは！";
        message[2] = "こんばんは！";

        if (args.length != 1) {
            System.out.println("使い方：java SelectGreeting 番号");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]);
        if (0 <= num && num < message.length) { //0～2の数字の場合
            System.out.println(message[num]);
        } else {                                //それ以外の場合
            System.out.println("番号は0～" + (message.length - 1) + "の範囲で指定してください");

        }
    }
}
