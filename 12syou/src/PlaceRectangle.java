/**
 * 問12-4　Rectangleのサブクラスを持つクラス
 */
public class PlaceRectangle extends Rectangle {
    int x;
    int y;

    //引数なしのコンストラクタ
    public PlaceRectangle() {
        setLocation(0, 0);
    }

    //位置付きあり
    public PlaceRectangle(int x, int y) {
        setLocation(x, y);
    }

    //位置と大きさを引数としたコンストラクタ
    public PlaceRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    //位置を決めるメソッド
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + super.toString() + "]";
    }

    //メイン
    public static void main(String[] args) {
        PlaceRectangle a = new PlaceRectangle(12, 34, 123, 45);
        System.out.println(a);
    }
}
