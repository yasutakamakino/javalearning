/**
 * 問題7-2 for文からwhile文に変更する問題　<br>
 * <pre>{@code
 * public class Graph1 {
 *      public static void main(String[] args) {
 *          for(int i=0 ; i < 10 ; i++){
 *              for(int j = 0; j <i*i ; j++) {
 *                  System.out.print("*");
 *              }
 *          System.out.println("");
 *          }
 *      }
 *   }
 * }</pre>
 */
public class Graph1 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        while (i < 10) {
            while (j < i * i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            j = 0;
            i++;
        }
    }
}

