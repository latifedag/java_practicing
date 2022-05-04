public class Main {
    public static void main(String[] args) {

        byte byteValue = 101;
        short shortValue = 901;
        int intValue = 3;

        long longVALUE = (50000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(longVALUE);
    }
}