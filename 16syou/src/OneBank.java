/**
 * 問16-11 OneBankクラス
 */

public class OneBank {
    //貯金残高
    private static int value = 0;

    //預け入れ・引き出し
    public static synchronized void addMoney(int money) { //「修正」publicを先頭に追加
        //現在の残高を保存
        int currentValue = value;
        //状況を表示
        System.out.println(Thread.currentThread() + "がaddMoneyに入りました。");//「修正」出力内容の表示とコメント
        //矛盾がないかどうかチェック
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread() + "で矛盾が発生しました！");//「修正」出力内容の表示とコメント
            System.exit(-1);
        }
        //状況を表示
        System.out.println(Thread.currentThread() + "がaddMoneyから出ました。"); //「修正」出力内容の表示とコメント
    }
}
