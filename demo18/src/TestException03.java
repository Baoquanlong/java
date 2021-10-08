import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * java.io.FileNotFoundException: Users\17502\Desktop\1.txt (系统找不到指定的路径。)
 * 	at java.base/java.io.FileInputStream.open0(Native Method)
 * 	at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
 * 	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
 * 	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
 * 	at TestException03.m3(TestException03.java:22)
 * 	at TestException03.m2(TestException03.java:18)
 * 	at TestException03.m1(TestException03.java:14)
 * 	at TestException03.main(TestException03.java:7)
 *
 * 	定位错误地点的方法可以从上往下定位，这样一来可以快速定位到出错的地方
 */
public class TestException03 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("Users\\17502\\Desktop\\1.txt");
    }
}
