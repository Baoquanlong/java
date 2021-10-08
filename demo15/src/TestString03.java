public class TestString03 {
    static  class A {
        public int a =10;
        public Boolean b = false;
        public int getA(){
            return a;
        }
        public Boolean getB(){
            return b;
        }
    }
    //trim方法
    //去除字符串前后空白
    public static void main(String[] args) {
        System.out.println("  hello world    adf     ".trim().length());


        //String 类中的唯一的静态方法：String.valueof(value)
        A c = new A();
        //调用了object 类的toString()方法。
        String newString = String.valueOf(c);

        System.out.println(newString);
    }


}
