/**
 * 問16-11 OneBankクラス
 */

public class OneBank {
    private static int value = 0;

    static synchronized void addMoney(int money) {
        int currentValue = value;
        System.out.println(Thread.currentThread());
        value += money;
        if (currentValue + money != value) {
            System.out.println(Thread.currentThread());
            System.exit(-1);
        }
        System.out.println(Thread.currentThread());
    }
}
