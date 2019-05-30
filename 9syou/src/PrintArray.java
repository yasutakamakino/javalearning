/**
 * 問題9-9 int型の二次元配列の内容を表示するプログラム
 * <pre>
 * {
 *   {3,1,4,1,},
 *   {5,9,2,},
 *   {6,5,},
 *   {3,},
 * }
 * </pre>
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 4, 1},
                {5, 9, 2,},
                {6, 5,},
                {3,},
        };
        printArray(arr); //メソッドを呼ぶ
    }

    /**
     * printArrayメソッド<br>
     * arrの二次元配列を表示するプログラム
     *
     * @param arr 数字が格納されている二次元配列
     */
    public static void printArray(int[][] arr) {
        System.out.println("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  { ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("},");

        }
        System.out.println("}");

    }
}
