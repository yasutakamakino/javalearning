/**
 * 問14-4 MyMediaPlayableインターフェースを拡張して、<br>
 * MysoundPlayableという名前のサブインターフェースを宣言してください。<br>
 * 追加するメソッドは、getSoundNameです。
 */
interface MyMediaPlayable {
    void play();
    void stop();
    void loop();
}

interface MySoundName extends MyMediaPlayable {
    String getSoundName();
}
