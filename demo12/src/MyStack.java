import java.sql.SQLOutput;

public class MyStack {
    public static void main(String[] args) {
        Stack S = new Stack();

        Animal ani1 = new Cat("baoquanlong");
        Animal ani2 = new Dog("chenchen");
        Animal animal = new Animal("xiaoshizi");

        System.out.println(S.isEmpty());
        S.print();

        try {
            S.push(ani1);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.push(ani2);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();
        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();
        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();
        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();
        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();
        try {
            S.push(animal);
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();

        try {
            S.pop();
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        }
        System.out.println(S.isEmpty());
        S.print();



        System.out.println(S.index);
    }
}



