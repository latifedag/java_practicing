public class Main {
    public static void main(String[] args) {
        System.out.println("Let's calculate!");
        System.out.println("circle area = " + area(2));
        System.out.println("circle area = " + area(-2));



    }
    public static double area(double radius){
        double circleArea = Math.PI * radius * radius;
        if (radius < 0){
            return -1;
        } else {
            return circleArea;
        }
    }
    public static double area(double x, double y){
        double rectangleArea = x * y;
        if (x < 0 || y < 0){
            return -1;
        } else {
            return rectangleArea;
        }
    }
    public static void printYearsAndDay(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            System.out.println(minutes + " min = " + years + " y and " + days % 365 + " d");
        }
    }
    public static void printEqual(int numOne, int numTwo, int numThree){
        if (numOne < 0 || numTwo < 0 || numThree < 0){
            System.out.println("Invalid Value");
        } else if (numOne == numTwo && numTwo == numThree){
            System.out.println("All numbers are equal");
        } else if (numOne != numTwo && numTwo != numThree && numOne != numThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            if (temperature < 25 || temperature > 45){
                return false;
            }
        } else if (!summer) {
            if (temperature < 25 || temperature > 35){
                return false;
            }
        }
        return true;
    }
}