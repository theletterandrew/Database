import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    HashMap<String, Bottle> allBottles;
    ArrayList<Bottle> myBottles;
    int bottleCount;
    Manager(){
        this.bottleCount = 0;
        allBottles = new HashMap<String, Bottle>();
        myBottles = new ArrayList<Bottle>();
    }
    void addBottle(Bottle bottle, String id){
        myBottles.add(bottle);
        allBottles.put(id, bottle);
        bottleCount++;
    }
    Bottle searchBottles(String id){
        Bottle bottle = allBottles.get(id);
        return bottle;
    }


}
