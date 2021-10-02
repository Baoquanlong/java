import org.jetbrains.annotations.NotNull;

/**
 * this class is the ancestor of all animals,
 * which has a attribute:"name",and method "move".
 */
public class Animal {
    private String name;
/**
 * @return
 * 构造函数
 **/
    public Animal(String name) {
        this.name = name;
    }

    public void move(@NotNull Animal al){
        System.out.println(al.getName()+"is moving!");
    }

    /**
     *
     * @return
     * name's getter and setter function.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
