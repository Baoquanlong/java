package demo1.src;

import java.util.Scanner;

public   class fac {
    public static int facts(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * facts(n - 1);
        }
    }
}
