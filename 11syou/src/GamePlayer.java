/**
 * 問題11-5 各名前を表示するプログラム<br>
 * <pre>
 * {@code
 * public class GamePlayer {
 *    public static String playername;
 *    public GamePlayer(String name) {
 *        playername = name;
 *    }
 *
 *    @Override public String toString() {
 *        return "[player:" + playername + "]";
 *    }
 *    public static void main(String[] args) {
 *        GamePlayer[] player = new GamePlayer[3];
 *        player[0] = new GamePlayer("Mad Hatter");
 *        player[1] = new GamePlayer("March Hare");
 *        player[2] = new GamePlayer("Alice");
 *        for (int i = 0; i <  player.length; i++) {
 *            System.out.println(player[i]);
 *        }
 *    }
 * }
 * }</pre>
 */
public class GamePlayer {
    public String playername; //staticを消した


    //コンストラクター
    public GamePlayer(String name) {
        playername = name;
    }

    //ゲームネームの文字列を得るためのtoStringメソッド
    @Override
    public String toString() {
        return "[player:" + playername + "]";
    }

    public static void main(String[] args) {
        GamePlayer[] player = new GamePlayer[3];
        player[0] = new GamePlayer("Mad Hatter");
        player[1] = new GamePlayer("March Hare");
        player[2] = new GamePlayer("Alice");
        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i]);
        }
    }
}
