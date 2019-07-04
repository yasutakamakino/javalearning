import java.util.ArrayList;

/**
 * 問題19-3 ArrayListの内部の作成
 */
public class Question {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        //list.add(1234);
        //*1

        System.out.println(list.get(2)); //*2

        System.out.println(list.size()); //*3

        for (String name : list) {
            System.out.println(name);
        }
    }
}
