import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
public class test_10 {
    public static void main(String[] args) {
        Animal al = new Cat("guy");
        al.move(al);
        Animal al2 = new Dog("Bob");
        al2.move(al2);

        Animal[] animals = {al,al2};

        Animal[] animals1 = new Animal[5];

        System.arraycopy(animals,0,animals1,0,2);

        for(int i = 0 ;i<animals1.length;i++){
            System.out.println("第"+i+"个是："+animals1[i]);
        }

    }
}


