import java.io.*;

/**
 * 問題7-3 標準出力を出すプログラムの作成
 */
public class MakeHtml {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("<!DOCTYPE html>");
            System.out.println("<html>");
            System.out.println("<head>");
            System.out.println("<title>My Page</title>");
            System.out.println("</head>");
            System.out.println("<body>");
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.charAt(0) == '■') { //最初が■で始まっていた場合
                    System.out.print("<h1>");
                    System.out.print(line.substring(1));
                    System.out.print("</h1>");

                } else if (line.charAt(0) == '●') { //最初が●で始まっていた場合
                    System.out.print("<h2>");
                    System.out.print(line.substring(1));
                    System.out.print("</h2>");
                } else {                            //それ以外の場合
                    System.out.print("<p>");
                    System.out.print(line);
                    System.out.print("</p>");
                }
                System.out.print("\n");
            }
            System.out.println("</body>");
            System.out.println("<html>");

        } catch (IOException e) {
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

