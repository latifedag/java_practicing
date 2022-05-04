public class Main {
    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("min = " +min);
        System.out.println("max = " +max);
        System.out.println("overflowed max  = " + (max + 1));
        System.out.println("underflowed min = " + (min - 1));

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("min byte = " + minByte);
        System.out.println("max byte = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("min short = " + minShort);
        System.out.println("max short = " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("min long = " + minLong);
        System.out.println("max long = " + maxLong);

        byte newByteValue = (byte) (minByte /2);
        short newShortValue = (short) (minShort /2);
        

    }
}