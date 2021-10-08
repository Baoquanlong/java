public class TestString02 {
    public static void main(String[] args) {
        //测试toCharArray方法
        char[] chars = "我是中国人".toCharArray();
//        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

}
