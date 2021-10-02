public class StringTest {
    public final static  int TEST_NUM  = 10;
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String string = "abcsdf";
        string.equals("adasd");
    }
}
