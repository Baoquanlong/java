public class Dog{
    int size ;
    String name;
    public void bark(){
        if(size>60){
            System.out.println("woof woof ");
        }else if(size>40){
            System.out.println("Ruf Ruf  ");
        }else{
            System.out.println("tik tok!");
        }
    }
}
