/**
 * 問16-11
 * List16-6のGoodBankTestは、GoodBankのインスタンスを生成して、貯金の預け入れと引き出しを行いました。<br>
 * これを変更して銀行口座がたった一つしかないプログラムにしてください。クラスの名前は、OneBankTestと<br>
 * OneBankにすること。<br>
 */
public class OneBankTest extends Thread {
    @Override
    public void run() {
        while (true) {
            OneBank.addMoney(100);
            OneBank.addMoney(-100);
        }
    }

    public static void main(String[] args) {
        new OneBankTest().start();
        new OneBankTest().start();
    }
}
