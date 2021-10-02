import org.jetbrains.annotations.NotNull;

public class Cat extends Animal{
    /**
     * @param name
     */
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move(@NotNull Animal al) {
        if (al instanceof Cat) {
            System.out.println(al.getName() + " is running to catch mouse!");
        }
    }

}
