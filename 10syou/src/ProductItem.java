/**
 * 問10-3間違っているコードを正す問題
 * <pre>
 * {@code
 * public class ProductItem {
 *      char name;
 *      int price;
 *
 *       @Override public String toString() {
 *          return [ + name + , + price + ];
 *      }
 * }
 * } </pre>
 */
public class ProductItem {
    String name;
    int price;

    @Override
    public String toString() {
        return "[" + name + "," + price + "]";
    }
}