package EstructurasDeControlFunciones;

public class E0411 {
    public static void main(String[] args) {
        System.out.println(mcdMain(8, 12));
        System.out.println(mcdMain(20, 12));
        System.out.println(mcdMain(21, 14));
        System.out.println(mcdMain(8, 8));
        System.out.println(mcdMain(0, 12));
        System.out.println(mcdMain(10, 0));
    }
    static int mcdMain(int a, int b) {
        int mcdFinal = 0;
        if (a == 0) {
            mcdFinal = mcd(b);
        } else if (b == 0) {
            mcdFinal = mcd(a);
        } else if (a > b) {
            mcdFinal = mcd(a - b, b);
        } else if (b > a) {
            mcdFinal = mcd(b - a, a);
        } else if (b == a) {
            mcdFinal = mcd(a);
        }

        return mcdFinal;
    }

    static int mcd(int a, int b) {
        int mcdFinal = 0;
        for (int i = 1; i < b; i++) {
            if (a % i == 0 && b% i == 0 ) {
                mcdFinal = i;
            }
        }
        return mcdFinal;
    }

    static int mcd(int a) {
        int mcdFinal = 0;
        for (int i = 1; i < a + 1; i++) {
            if (a % i == 0) {
                mcdFinal = i;
            }
        }
        return mcdFinal;
    }

}
