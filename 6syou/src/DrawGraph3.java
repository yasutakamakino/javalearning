
/**
 * 問題6-3 間違いがあるコードを正す問題<br>
 * <pre>{@code
 * public class DrawGraph3 {
 *     public static void main(String[] args) {
 *         for (int i = 0; i < 10; i++) {
 *             System.out.print(i + ":");
 *             for (int j = 0; j < i; i++) {
 *                 System.out.print("*");
 *             }
 *             System.out.println(" ");
 *         }
 *     }
 * }
 * }<pre/>
 */
public class DrawGraph3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ":");
            for (int j = 0; j < i; j++) { //ここの++iを++jにすることにより暴走しなくなる。
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

