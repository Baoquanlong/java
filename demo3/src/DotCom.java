import java.util.ArrayList;
public class DotCom {
    private ArrayList<String> locationcells;
    private String name;
    public void setLocationcells(ArrayList<String> loc){
        locationcells = loc;
    }

    public String checkyourself(String username){
        String result = "miss";
        int index = locationcells.indexOf(username);

        if (index >= 0 ){
            locationcells.remove(index);

            if(locationcells.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }

        }
        return result;
    }

    public void setName(String s) {
        name = s;
    }

    public void setlocations(ArrayList<String> newlocations) {
    }
}
