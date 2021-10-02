import java.sql.SQLOutput;

public class MyStack {
    public static void main(String[] args) {
        Stack S = new Stack();

        Animal ani1 = new Cat("baoquanlong");
        Animal ani2 = new Dog("chenchen");
        Animal animal = new Animal("xiaoshizi");

        System.out.println(S.isEmpty());
        S.print();

        S.push(ani1);
        System.out.println(S.isEmpty());
        S.print();

        S.push(ani2);
        System.out.println(S.isEmpty());
        S.print();

        S.push(animal);
        System.out.println(S.isEmpty());
        S.print();
        S.push(animal);
        System.out.println(S.isEmpty());
        S.print();
        S.push(animal);
        System.out.println(S.isEmpty());
        S.print();
        S.push(animal);
        System.out.println(S.isEmpty());
        S.print();
        S.push(animal);
        System.out.println(S.isEmpty());
        S.print();
        S.push(animal);

        S.pop();
        System.out.println(S.isEmpty());
        S.print();

        S.pop();
        System.out.println(S.isEmpty());
        S.print();

        S.pop();
        System.out.println(S.isEmpty());
        S.print();

        S.pop();
        System.out.println(S.isEmpty());
        S.print();

        System.out.println(S.index);
    }
}



