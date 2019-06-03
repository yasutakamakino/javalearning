/**
 * 3教科の試験の合計を学生ごとに表示するコード（main)
 */
public class StudentTest {
    public static void main(String[] args) {
        //インスタンスの配列
        Student[] data = {
                new Student("結城浩", 65, 90, 100),
                new Student("阿部和馬", 82, 73, 64),
                new Student("伊藤光一", 74, 31, 42),
                new Student("佐藤太郎", 100, 95, 99),
        };
        //名前と3科目の点数とその合計を表示する。
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + "  \t->" + data[i].total());
        }
    }
}
