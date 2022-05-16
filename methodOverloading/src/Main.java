public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        calcFeetAndInchesToCantimeters(157);
    }

    public static double calcFeetAndInchesToCantimeters(double feet, double inches){
        if ((feet < 0) || (inches < 0) || (inches > 12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double cantimeters = (feet * 12) * 2.54;
        cantimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cantimeters + " cm");
        return cantimeters;
        }
    public static double calcFeetAndInchesToCantimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCantimeters(feet, remainingInches);
    }

}