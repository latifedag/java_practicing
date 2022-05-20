public class Main {
    public static void main(String[] args) {
        int switchValue = 1;
        char character = 'A';
        String month = "january";
        printDayOfTheWeek(1);
        printDayOfTheWeek(8);
        printDayOfTheWeek(5);
        printNumberInWord(0);
        printNumberInWord(5);
        switch (switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or 4, or 5");
                System.out.println("was actually " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        switch (character){
            case 'A':
                System.out.println("found 'A'");
                break;
            case 'B':
                System.out.println("found 'B'");
                break;
            case 'C':
                System.out.println("found 'C'");
                break;
            case 'D':
                System.out.println("found 'D'");
                break;
            case 'E':
                System.out.println("found 'E'");
                break;
            default:
                System.out.println("found nothing");
                break;
        }
        switch (month){
            case "january":
                System.out.println("January");
                break;
            case "":
                System.out.println(month);
                break;
            default:
                System.out.println("idk");
                break;
        }
    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case (9):
                System.out.println("NINE");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
    }
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return -1;
        } else if (year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 2:
                if (isLeapYear(year)){
                return 29;
                } else {
                    return 28;
                }
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }
    }
}