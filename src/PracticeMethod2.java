public class PracticeMethod2 {

    static void getCarDescription(String model, int productionYear, String condition){
        System.out.println("This car is a " + model);
        System.out.println("Production year: " + productionYear);
        System.out.println("It is in " + condition + " condition");

    }
    public static void main(String[] args){
         getCarDescription("Tesla Roadster", 2018, "good");
    }

}
