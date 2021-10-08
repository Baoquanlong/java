import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate01{
    public static void main(String[] args) throws ParseException {
        Date nowDate = new Date();
        System.out.println(nowDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s = sdf.format(nowDate);
        System.out.println(s);
        String ss = "2021-10-04 20:58:52 918";
        Date date = sdf.parse(ss);
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
    }

}
