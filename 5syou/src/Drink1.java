import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 問題5-4　list 5-1を修正したプログラム
 */
public class Drink1 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 ミルク");
            System.out.println("1,2,3のどれかを選んでください。");
            String line = reader.readLine();  //数字を入力
            int  n =Integer.parseInt(line);     //int型に変換
            switch(n) {
                case 1: //入力が１の場合
                System.out.println("オレンジジュースです。");
                break;
                case 2: //入力が２の場合
                System.out.println("コーヒーです。");
                break;
                case 3: //入力３の場合
                System.out.println("ミルクです。");
                break;
                default: //それ以外の場合
                    System.out.println("どちらでもありません。");
                    break;
            }
        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("数字の形式が正しくありません。");
        }
    }
}
