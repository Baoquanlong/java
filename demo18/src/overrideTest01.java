import java.security.PublicKey;

public class overrideTest01 {
    //覆盖后的方法不能比覆盖前的方法抛出更多的异常。

    public static void main(String[] args) {

    }
}
class A {
        public void aa() throws RuntimeException{

        }
}

class B extends A{
    @Override
    public void aa()  {

    }
}