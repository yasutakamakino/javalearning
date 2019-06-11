/**
 * 問13-2　myAssignメソッドの中で例外処理を行う
 */
public class ExceptionTest3 {
    //mainメソッド
    public static void main(String[] args) {
        int[] myarray = new int[3];
        System.out.println("代入します");
        myAssign(myarray, 100, 0);
        System.out.println("終了します");
    }

    //例外処理を行うmyAssignメソッド
    static void myAssign(int[] arr, int index, int value) {
        try {
            System.out.println("myAssignに来ました");
            arr[index] = value;
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("myAssignから帰ります");
    }
}
