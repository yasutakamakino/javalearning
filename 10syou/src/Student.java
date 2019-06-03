/**
 * 問題10-5 3教科の試験の合計を学生ごとに表示するコード（メソッドとコンストラクタのみ）
 */
public class Student {
    String name; //氏名
    int[] tens; //試験の点数

    //氏名と試験の点数のコンストラクタ
    public Student(String name, int x, int y, int z) {
        this.name = name;
        this.tens = new int[3];
        this.tens[0] = x;
        this.tens[1] = y;
        this.tens[2] = z;
    }

    //名前と試験の点数の文字列を得るためのtoStringメソッド
    @Override
    public String toString() {
        String s = "[" + name;
        for (int i = 0; i < tens.length; i++) {
            s += "," + tens[i];
        }
        s += "]";
        return s;
    }

    /**
     * totalメソッド<br>
     * 試験の点数合計を計算するメソッド
     *
     * @return sum 点数の合計
     */
    public int total() {
        int sum = 0;
        for (int i = 0; i < tens.length; i++) {
            sum += tens[i];
        }
        return sum;
    }
}
