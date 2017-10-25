public class Main {
    public static void main(String [] args){
        Manager myManager = new Manager();

        Whiskey jameson = new Whiskey();
        jameson.setWhiskeyType("Irish");
        jameson.setCountry("Ireland");
        jameson.setName("Jameson");
        jameson.setPercentLeft(100.00);
        jameson.setYear(2000);
        myManager.addBottle(jameson);
        Wine riesling = new Wine();
        riesling.setWineType("Riesling");
        riesling.setCountry("Germany");
        riesling.setName(" Egon Muller Scharzhofberger Spatlese Riesling");
        riesling.setPercentLeft(100.00);
        riesling.setYear(2015);
        myManager.addBottle(riesling);

        Bottle result = myManager.searchBottles("Jameson");
        System.out.println(result.name);
    }
}
