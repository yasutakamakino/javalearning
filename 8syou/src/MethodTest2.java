/**
 * 問題8-5 メソッドから２つの文字列を返すプログラム(インスタンスを用いた）
 */
public class MethodTest2 {
    String first;
    String last;

    /**
     * getYourNameメソッド<br>
     * メソッドの中で名字と名前を得るメソッド
     * @return 名字と名前が入っているインスタンスを返す。
     */
    public static MethodTest2 getYourName(){
        MethodTest2 a = new MethodTest2();
        a.last="結城";
        a.first="浩";
        return a;
    }
    public static void main(String[] args){
        MethodTest2 name = getYourName();
        System.out.println("名字:" + name.last);
        System.out.println("名前:" + name.first);
    }
}