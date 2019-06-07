/**
 * 問11-6　引数を一つにした場合のコード
 */
public class Rectangle4 {
    int width; //幅
    int height;//高さ

    //幅と高さのコンストラクタ
    public Rectangle4(int x, int y) {
        this.width = x;
        this.height = y;
    }

    //２つのRectangleを比較して、等しかったらtrue,
    //等しくなかったらfalseを返す
    boolean areSame(Rectangle4 b) {
        if (b == null) {
            return false;
        } else if (width == b.width && height == b.height) {
            return true;
        } else {
            return false;
        }
    }

    //mainメソッド
    public static void main(String[] args) {
        Rectangle4 a = new Rectangle4(123, 45);
        Rectangle4 b = new Rectangle4(123, 45);
        boolean truth = a.areSame(b);
        System.out.println(truth);
    }
}
