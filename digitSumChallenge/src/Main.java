public class Main {
    public static void main(String[] args) {
        sumDigits(567);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("sum of the digits = " + sum);
        return sum;
    }
}