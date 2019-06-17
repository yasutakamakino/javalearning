import java.awt.*;

/**
 * 問14-3
 * 次のメソッドとフィールドを持つ、IconType,戻り値の型はImage型で、名前がgetIconであるメソッド<br>
 * 型はintで名前はICON_16x16,値は１であるフィールド<br>
 * 型はintで名前はICON_32x32,値は2であるフィールド
 */
public interface IconInfo {
    Image getIcon(int iconType);

    int ICON_16x16 = 1;
    int ICON_32x32 = 2;

}
