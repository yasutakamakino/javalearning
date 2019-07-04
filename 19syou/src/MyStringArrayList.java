/**
 * 問題19-3 ArrayListの内部の作成
 */
public class MyStringArrayList {
    private static final int INITTAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITTAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (ar.length == sz) {
            String[] newar = new String[ar.length * 2];
            System.arraycopy(ar, 0, newar, 0, sz);
            ar = newar;
        }
        ar[sz] = s;
        sz++;
    }

    public void get(int n) {
        if ((0 <= n) && (n < ar.length)) {
            for (int i = 0; i < n; i++) {
                System.out.println(ar[i]);
            }
        }else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return sz;
    }

    public static void main(String[] args) {
        MyStringArrayList msal = new MyStringArrayList();
        msal.add("あ");
        msal.add("い");
        msal.add("う");
        msal.add("え");
        msal.add("お");
        msal.get(msal.sz);
        System.out.println(msal.size());
    }
}
