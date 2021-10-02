import org.jetbrains.annotations.NotNull;

public class Dog extends Animal {

    /**
     * @param name
     * @return 构造函数
     */
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move(@NotNull Animal al) {
        System.out.println(al.getName()+" is running to bite bad guy! ");
    }
}
