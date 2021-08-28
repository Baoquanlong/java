import java.util.Scanner;

public class guess_game {
    private  int guess_num;
    public guess_game(int guess_num){
        segues_num(guess_num);
    }
    public void segues_num(int guess_num){
        this.guess_num = guess_num;
    }

    public void goodshot(){
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a number for guessing! ");
            int x = s.nextInt();
            if(x == this.guess_num){
                System.out.println("bingo!!");
                break;
            }else{
                if(x>this.guess_num){
                    System.out.println("Too hign!");
                }else{
                    System.out.println("Too low! ");
                    System.out.println();
                }
            }
        }
    }
}
