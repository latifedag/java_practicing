public class Main {
    public static void main(String[] args) {

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
            return; }
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        } if (barking == true && hourOfDay < 8){
            return true;
        } else if (barking == true && hourOfDay > 22){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isLeapYear (int year){
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0){
                if (year % 100 == 0){
                    return  (year % 400 == 0);
                } else return true;
            } else return false;
        } else return false;
    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        if ((int) (numberOne * 1000) == (int) (numberTwo * 1000)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean hasEqualSum(int valOne, int valTwo, int valThree){
        if ((valOne + valTwo) == valThree){
            return true;
        } else {
            return false;
        }
    }
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        if (((ageOne >= 13) && (ageOne <= 19)) || ((ageTwo >= 13) && (ageTwo <= 19)) || ((ageThree >= 13) && (ageThree <= 19))){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isTeen(int age){
        if(age >= 13 && age <= 19){
            return true;
        } else {
            return false;
        }
    }
    
}
// public class BarkingDog {
//     public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//          if (hourOfDay < 8 && hourOfDay > 22){
//            return true;
//        } else if (hourOfDay < 0 && hourOfDay > 23){
//            return false;
//        }
//        return false;
//    }
//}