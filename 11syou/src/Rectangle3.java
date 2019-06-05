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
    Rectangle3(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);

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
        return "[" + x + ", " + y + ", " + width + ", " + height + "]";
    }

    //長方形が重なりとその重なり部分の値を得るメソッド
    Rectangle3 intersect(Rectangle3 m) {
        int sx = Math.max(x, m.x);
        int sy = Math.max(y, m.y);
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
        Rectangle3 r1 = new Rectangle3(0, 0, 10, 10);
        Rectangle3 r2 = new Rectangle3(0, 0, 30, 30);
        Rectangle3 r3 = new Rectangle3(20, 20, 20, 20);
        Rectangle3 r4 = new Rectangle3(5, 5, 5, 50);
        Rectangle3 a = r1.intersect(r2); //r1とr2を重なるか判定
        Rectangle3 b = r1.intersect(r3); //r1とr3が重なるか判定
        Rectangle3 c = r1.intersect(r4); //r1とr4が重なるか判定
        Rectangle3 d = r2.intersect(r3); //r2とr3が重なるか判定
        Rectangle3 e = r2.intersect(r4); //r2とr4が重なるか判定
        Rectangle3 f = r3.intersect(r4); //r2とr4が重なるか判定
        System.out.println("r1とr2で重なる部分" + a + "です");
        System.out.println("r1とr3で重なる部分" + b + "です");
        System.out.println("r1とr4で重なる部分" + c + "です");
        System.out.println("r2とr3で重なる部分" + d + "です");
        System.out.println("r2とr4で重なる部分" + e + "です");
        System.out.println("r3とr4で重なる部分" + f + "です");
    }
}
