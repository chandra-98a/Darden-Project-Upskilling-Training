public class PracticeMethod {

    char energyEfficiencyCategory;
    static String getEnergyEfficiency(char energyEfficiencyCategory) {
        switch (energyEfficiencyCategory) {
            case 'A':
            case 'a':
                return "Very low energy consumption";
            case 'B':
            case 'b':
                return "Low energy consumption";
            case 'C':
            case 'c':
                return "Normal energy consumption";
            case 'D':
            case 'd':
                return "Above normal energy consumption";
            case 'E':
            case 'e':
                return "High energy consumption";
            case 'F':
            case 'f':
                return "Very high energy consumption";
            case 'G':
            case 'g':
                return "Extremely high energy consumption";
            default:
                return "not defined category";
        }
    }
    public static void main(String[] args){
        System.out.println(" The energy consumption Level is: "+ getEnergyEfficiency('c'));
    }
}

