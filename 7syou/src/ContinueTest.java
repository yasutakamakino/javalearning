import java.io.*;

/**
 * 問題7-4 文字を入力し、入力した文字の最後が"{"または"}" である場合、入力した文字が表示されるコード<br>
 * <pre>{@code
 * public class ContinueTest {
 *      public static void main(String[] ars) {
 *          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 *          try {
 *               String line;
 *               while ((line = reader.readLine()) != null){
 *                  if (!line.endsWith("{") && !line.endsWith("}")) {
 *                      continue;
 *                  }
 *                  System.out.println(line);
 *              }
 *          } catch (IOException e) {
 *              System.out.println(e);
 *          }
 *       }
 *    }
 * }</pre>
 */
public class ContinueTest {
    public static void main(String[] ars) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("{") || line.endsWith("}")) { //入力された最後の文字が"{"か"}"の場合
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

