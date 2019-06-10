/**
 * 問13-3　例外を判断できるようなコード
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            method1(0);
            method2(0);
            method3(0);
        } catch (Exception e) {
            e.printStackTrace(); //例外起こっているメソッドを探して表示
            //System.out.println(e);
        }
    }

    static void method1(int x) throws Exception {

    }

    static void method2(int x) throws Exception {
        throw new Exception();//例外を発生させる
    }

    static void method3(int x) throws Exception {
    }

}
