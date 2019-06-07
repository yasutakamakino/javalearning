/**
 * 問12-5 Rectangle型のインスタンス変数を持つクラス
 */
public class PlaceRectangle2 {
    Rectangle r;
    int x;
    int y;

    //引数なしのコンストラクタ
    public PlaceRectangle2() {
        r=new Rectangle();
        setLocation(0, 0);
    }

    //位置付きあり
    public PlaceRectangle2(int x, int y) {
        r=new Rectangle();
        setLocation(x, y);
    }

    //位置と大きさを引数としたコンストラクタ
    public PlaceRectangle2(int x, int y, int width, int height) {
        r=new Rectangle(width, height);
        setLocation(x, y);
    }

    //位置を決めるメソッド
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[ (" + x + ", " + y + ") " + r + "]";
    }

    //メイン
    public static void main(String[] args) {
        PlaceRectangle2 a = new PlaceRectangle2(12, 34, 123, 45);
        System.out.println(a);
    }
}
