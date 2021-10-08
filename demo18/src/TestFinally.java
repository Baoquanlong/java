public class TestFinally {
    public static void main(String[] args) {
        int a = m1();
        System.out.println(a);
    }

    private static int m1() {
        int i = 100;
        try {
            return i;
        }finally {
            i++;
        }
    }
}
