/**
 * 問題11-8　値がマイナスの時の対処が行われているプログラム
 */
public class Rectangle2 {
    int width;  //幅
    int height; //高さ

    //引数なしのコンストラクタ
    Rectangle2() {
        setSize(10, 20);
    }

    //引数ありのコンストラクタ
    Rectangle2(int w, int h) {
        setSize(w, h);
    }

    /**
     * setSizeメソッド<br>
     * 幅と高さを格納するメソッド
     *
     * @param w 　幅
     * @param h 高さ
     */
    void setSize(int w, int h) {
        /*
        if (w < 0) w = 0;
        if (h < 0) h = 0;
        */

        //3項演算子を使った場合
        width = w < 0 ? 0 : w;
        height= h < 0 ? 0 : h;

    }


    /**
     * getAreaメソッド<br>
     * 長方形の面積を図るメソッド
     *
     * @retuen 長方形の面積
     */
    int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle2 r1 = new Rectangle2();
        System.out.println("r1.width=" + r1.width);
        System.out.println("r1.height=" + r1.height);
        System.out.println("r1.getArea=" + r1.getArea());
        Rectangle2 r2 = new Rectangle2(-125, 45);
        System.out.println("r2.width=" + r2.width);
        System.out.println("r2.height=" + r2.height);
        System.out.println("r2.getArea() =" + r2.getArea());
    }

}
