import java.io.*;
import java.util.*;
public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength  = 7;
    private int gridsize = 49;
    private int comCount = 0;
    private int [] grid = new int [gridsize];

    public String getuserinput(String prompt){
        String inputline  = null;
        System.out.print(prompt + "  ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputline  = is.readLine();
            if (inputline.length() == 0 ){return null;}
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputline.toLowerCase();

    }

    public ArrayList<String> placeDotcom(int comsize){
        ArrayList<String> alphacells = new ArrayList<String>();
        String [] alphacoords = new String[comsize];
        String temp = null;
        int [] coords = new int [comsize];
        int attempt = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2)==1){
            incr = gridLength;
        }
        while(!success && attempt++<200){
            location = (int) (Math.random()*gridsize);
            int x = 0;
             success  = true;
             while (success && x <comsize){
                 if (grid[location] ==0 ){
                     coords[x++] = location;
                     location += incr;
                     if (location >=gridsize){
                         success = false;
                     }
                     if (x>0 && (location % gridLength==0)){
                         success = false;
                     }
                 }else {
                     success = false;
                 }
             }
        }

        int x = 0 ;
        int row =0;
        int column = 0;
        while(x<comsize){
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] %gridLength;
            temp = String.valueOf(alphabet.charAt(column));

            alphacells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphacells;
    }
}
