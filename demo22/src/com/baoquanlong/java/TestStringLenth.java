package com.baoquanlong.java;

public class TestStringLenth {
    public static void main(String[] args) {
        int length = TestStringLenth.stringSize(1000);
        System.out.println(length);

        System.out.println();
    }

    static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {
            d = 0;
            x = -x;
        }
        int p = -10;
        for (int i = 1; i < 10; i++) {
            if (x > p)
                return i + d;
            p = 10 * p;
        }
        return 10 + d;
    }
}
