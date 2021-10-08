public class test {
    //this class is created for testing << and >>
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a<<1);
        System.out.println(a>>1);
        byte[] b  = {
                1,
                2,
                3,
                127,
                -128
        };
//        System.out.println(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            System.out.println();
        }

        byte[] c = {'h','e','l','l','o','w','o','r','l','d',' '};

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        System.out.println();

        int retValue = Integer.parseInt("111");
        System.out.println(retValue);



    }

}
