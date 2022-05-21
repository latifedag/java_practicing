public class Main {
    public static void main(String[] args) {
        System.out.println("sum of some odds = " + sumOdd(13, 17));
        System.out.println("10,000 at %2 interest = " + calculateInterest(10000, 2));
        for (int interest=8; interest>2; interest--){
            System.out.println("10,000 at " + interest + "% = "
                    + String.format("%.2f",calculateInterest(10000, interest)));
        }
        for (int i=0; i<6; i++){
            System.out.println("for " + i);
        }
        int count = 0;
        for (int i=0; i<50; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("number " + i + " is a prime number");
                if (count == 3){
                    System.out.println("ending the loop");
                    break;
                }
            }
        }
        int sum = 0;
        int c = 0;
        for (int i=1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                c ++;
                sum += i;
                System.out.println("Found number = " + i);
                if (c == 5){
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
    public static boolean isPrime(int n){
        if (n == 1 || n == 0){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isOdd(int number){
        if (number <= 0){
            return false;
        } if (number == 1 || (number % 2) != 0){
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start){
            System.out.println("start and sum > 0?, end > start?");
            return -1;
        } else {
            for (int i=start; i<end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
        }
        return sum;
    }
}