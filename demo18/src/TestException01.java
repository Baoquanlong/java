import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException01 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\17502\\Desktop\\1.txt");
            System.out.println(file);
            System.out.println(file.getFD());
            System.out.println(file.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
