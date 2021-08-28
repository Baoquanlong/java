public class Master {
    public void feed(Animal an){
        if(an instanceof Bird){
            System.out.println("Feeding "+an.getName());
            an.eat();
        }else if(an instanceof  Cat){
            System.out.println("Feeding "+an.getName());
            an.eat();
        }else if(an instanceof  Dog){
            System.out.println("Feeding "+an.getName());
            an.eat();
        }
    }
}
