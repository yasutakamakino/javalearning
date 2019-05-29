/**
 * 問題8-5 メソッドから２つの文字列を返すプログラム
 */
public class MethodTest {
    public static void main(String[] args) {
        String[] name;
        name = new String[2];
        getYourName(name);
        System.out.println("名字:" + name[0]);
        System.out.println("名前:" + name[1]);
    }

    /**
     * getYourNameメソッド<br>
     * メソッドの中で名字と名前を得るメソッド
     * @param name 名字と名前を格納する配列
     */
    public static void getYourName(String[] name) {
        name[0] = "結城";
        name[1] = "浩";
    }
}
