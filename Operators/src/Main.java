public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(" 1 + 2 = " + result);
        int previousResult = result;
        result = result - 1;
        result = 3 * result;
        System.out.println(" previous Result: " + previousResult );
        System.out.println(" 2 * 3 = " + result);
        result = result / 3;
        System.out.println(" previous Result: " + previousResult );
        result = result - 1;
        System.out.println(" what is equals to = " + result + "?");

        result ++;
        System.out.println(" " + result);
        result --;
        System.out.println(" " + result);
        result += 19;
        System.out.println(" " + result);
        result /= 10;
        System.out.println(" " + result);
        result *= 7;
        System.out.println(" " + result);
        

    }
}