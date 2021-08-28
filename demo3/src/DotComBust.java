import java.util.*;
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotcomList = new ArrayList<DotCom>();
    private int numofGuesses = 0;

    private void setupGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotcomList.add(one);
        dotcomList.add(two);
        dotcomList.add(three);


        System.out.println("Your goal is to shoot three Dotcoms");
        System.out.println("Pets.com , eToys.com , Go2.com ");
        System.out.println("try to sink them all in the fewest number of guesses");


        for (DotCom dotcomtoset : dotcomList) {
            ArrayList<String> newlocations = helper.placeDotcom(3);
            dotcomtoset.setlocations(newlocations);
        }
    }
    private void startplaying(){
        while(!dotcomList.isEmpty()){
            String userguess = helper.getuserinput("Enter a guess");
            checkuserGuess(userguess);
        }
        finishGame();
    }

    private void checkuserGuess(String userguess){
        numofGuesses++;
        String result = "miss";

        for(DotCom dotcomtotest : dotcomList){
            result  = dotcomtotest.checkyourself(userguess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotcomList.remove(dotcomtotest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All dot are dead!");
        if(numofGuesses<=18){
            System.out.println("It's only took your"+ numofGuesses + "guesses");
            System.out.println("You win");
        }else{
            System.out.println("you lose, you are not win, cause you have use" + numofGuesses+ "guesses");
        }
    }

    public void main(String [] args){
        DotComBust game = new DotComBust();
        game.setupGame();
        game.startplaying();

    }


}
