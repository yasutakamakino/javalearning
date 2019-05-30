/**
 * 問題10-2 「長方形」のクラスを宣言する
 */
public class Rectagle {
    int width;      //幅
    int height;     //高さ

    //幅と高さを指定するコンストラクタ
    public Rectagle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //文字列を得るためのtoStringメソッド
    @Override
    public String toString() {
        return "[ " + width + ", " + height + " ]";
    }

    //mainメソッド
    public static void main(String[] args) {
        Rectagle tyohoke = new Rectagle(123, 45);   //インスタンスを作成
        System.out.println(tyohoke);    //表示する
    }
}
