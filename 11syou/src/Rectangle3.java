/**
 * 問題11-9 長方形が重なりを判別するコード
 */
public class Rectangle3 {
    final int INITIAL_WIDTH = 0;
    final int INITIAL_HEIGHT = 0;
    int width;
    int height;
    int x;
    int y;

    //引数がないコンストラクター
    Rectangle3() {
        this.width = INITIAL_WIDTH;
        this.height = INITIAL_HEIGHT;
        x = 0;
        y = 0;
    }

    //widthtとheightだけ引数を持つコンストラクタ
    Rectangle3(int width, int height) {
        setSize(width, height);
        x = 0;
        y = 0;
    }

    //すべての引数を持つコンストラクタ
    Rectangle3(int width, int height, int x, int y) {
        setSize(width, height);
        setLocation(x, y);
    }

    /**
     * setLocationメソッド<br>
     * x座標とy座標を格納するメソッド
     *
     * @param x x座標
     * @param y y座標
     */
    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * setSizeメソッド<br>
     * 幅と高さを格納するメソッド
     *
     * @param w 　幅
     * @param h 高さ
     */
    void setSize(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "," + width + "," + height + "]";
    }

    //長方形が重なりとその重なり部分の値を得るメソッド
    Rectangle3 interesect(Rectangle3 m) {
        int sx = Math.max(x, m.x);
        int sy = Math.min(y, m.y);
        int ex = Math.min(x + width, m.x + m.width);
        int ey = Math.min(y + height, m.y + m.height);
        int w = ex - sx;
        int h = ey - sy;
        if (w > 0 && h > 0) {
            return new Rectangle3(sx, sy, w, h);
        } else {
            return null;
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        Rectangle3 r1 = new Rectangle3(10, 10, 0, 0);
        Rectangle3 r2 = new Rectangle3(10, 10, 15, 15);
        Rectangle3 a = r1.interesect(r2);
        System.out.println(a);
    }
}
