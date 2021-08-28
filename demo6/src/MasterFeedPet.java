public class MasterFeedPet {
    public static void main(String[] args) {
        Master master = new Master();
        Animal bird = new Bird("bird");
        Animal dog = new Dog("dog");
        Animal cat  =new Cat("cat");
        master.feed(bird);
        master.feed(dog);
        master.feed(cat);

    }
}
