public class Animal {
    private String name;

    public Animal(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
}
