public class Main {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = (firstValue + secondValue) * 100.00d;
        System.out.println(" value = " + thirdValue);
        double remainder = thirdValue % 40.00d;
        System.out.println(" remainder = " + remainder);
        boolean isRemainderZero = (remainder == 0)? true:false;
        System.out.println(" Is remainder zero? " + " - " + isRemainderZero);
        if (isRemainderZero != true){
            System.out.println(" remainder is not zero ");
        }
        
    }
}