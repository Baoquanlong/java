public class TestFinally01 {
    //只有system.exit(0)语句可以关闭finally的执行。退出jvm,return都不可以。
    //hello world
    //hello
    public static void main(String[] args) {
        m1();
        m2();
    }

    private static void m2() {
        try {
            System.out.print("hello ");
            System.exit(0);
        }finally {
            System.out.println("world");
        }
    }

    private static void m1() {
        try {
            System.out.print("hello ");
            return;
        }finally {
            System.out.println("world");
        }
    }


}
