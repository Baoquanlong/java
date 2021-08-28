public class abstractTest {
    public static void main(String[] args) {
        parent one = new son();
        parent two = new grandson();
        one.doSome();
        two.doSome();
    }
}
