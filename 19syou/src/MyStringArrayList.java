/**
 * 問題19-3 ArrayListの内部の作成
 */
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4; //「修正」INITTAL⇒INITIAL
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (ar.length == sz) {
            String[] newAr = new String[ar.length * 2];  //「修正」newar⇒newAr
            System.arraycopy(ar, 0, newAr, 0, sz);
            ar = newAr;
        }
        ar[sz] = s;
        sz++;
    }

    public String get(int n) {
        if ((0 <= n) && (n < ar.length)) {
            return ar[n];
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
        for (int i = 0; i < msal.sz; i++) {
            System.out.println(msal.get(i));
        }
        System.out.println(msal.size());
    }
}
