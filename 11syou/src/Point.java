/**
 * 問題11-4　エラーを修正したプログラム
 * <pre>
 * {@code
 * class Point {
 *      int x;
 *      int y;
 *      static void SetPosition(int x, int y){
 *          this.x=x;
 *          this.y=y;
 *      }
 * }
 * } </pre>
 */
class Point {
    int x;
    int y;

    void SetPosition(int x, int y) { //staticを抜いた
        this.x = x;
        this.y = y;
    }
}
