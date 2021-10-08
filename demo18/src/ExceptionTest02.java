import java.io.OutputStream;
import java.io.PrintStream;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //异常对象的两个重要方法：
        //getMassage()和
        //printStackTrace()方法
//        PrintStream ps = new PrintStream();

        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe.getMessage());
//        npe.printStackTrace();
    }
}
