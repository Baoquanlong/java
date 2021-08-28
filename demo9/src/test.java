public class test {
    public static void main(String[] args) {
        abstract01  ab =  new abstract01() {
            @Override
             int divide(int a, int b) {
                return a/b;
            }

            @Override
            public int aa(int a, int b) {
                    return a*b;
            }

            @Override
            public int A(int a, int b) {
                return  a-b;
            }
        };
        System.out.println(ab.sum(1,2));
        System.out.println(ab.divide(1,2));
        System.out.println(ab.A(1,2));

    }
}
