public class Manager {
    Bottle [] myBottles;
    int bottleCount;
    Manager(){
        this.bottleCount = 0;
        this.myBottles = new Bottle[500];
    }
    void addBottle(Bottle bottle){
        myBottles[bottleCount] = bottle;
        bottleCount++;
    }
    Bottle searchBottles(String searchName){
        for(int i = 0; i<bottleCount; i++){
            if(myBottles[i].name.equals(searchName)){
                return myBottles[i];
            }
        }
        return null;
    }
    Bottle searchYear(int year){
        for(int i=0; i<bottleCount; i++){
            if(myBottles[i].year == year){
                return myBottles[i];
            }
        }
        return null;
    }
}
