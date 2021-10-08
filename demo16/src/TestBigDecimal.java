import java.math.BigDecimal;

/**
 * BigDecimal类是大数据处理类，再java.math.BigDecimal类中。
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(3.14);
        BigDecimal bd2 = new BigDecimal(1313);
//        BigDecimal bdAdd = bd.add(bd2);
//        System.out.println(bdAdd);
        BigDecimal bd3 = new BigDecimal(3);
        BigDecimal bd4 = new BigDecimal(1314);
        BigDecimal bd5 = bd4.divide(bd3);
        System.out.println(bd5);

    }
}
