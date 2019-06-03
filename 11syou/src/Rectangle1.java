/**
 * 問題11-7　インスタンスを表示するプログラム
 */
public class Rectangle1 {
    int width; //幅
    int height;//高さ

    //幅と高さのコンストラクタ
    public Rectangle1(int x, int y) {
        this.width = x;
        this.height = y;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + "," + height + ")";
    }

    public static void main(String[] args) {
        Rectangle1 Rectangle = new Rectangle1(123, 45);
        System.out.println(Rectangle);
    }
}
