public class for_cycle {
    private int n;
    private int sum=0;
    public  for_cycle(int n){
        this.n=n;
    }

    public int for_cycle(){
        for(int i=0; i<=this.n;i++){
            sum+=i;
        }
        return sum;
    }



    public static void main(String [] args){
        for_cycle for1 = new for_cycle(10);
        int num = for1.for_cycle();
        System.out.println("The sum of 10 is :"+num);
    }

}