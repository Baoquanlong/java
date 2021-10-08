import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int rint = random.nextInt(10);
        System.out.println(rint);

    }

}
