public class PrimitiveTypes {
    public static void main(String[] args){
        /*
            Java has 8 primitive types being....
            boolean
            byte
            char
            short
            int
            long
            float
            double

            These are the fundamental building blocks available to us in Java

            Wrapper classes: Java has a wrapper class for all primitive data types.
            incase of int its Integer, this gives us access to perform operations
            on an int.
         */

//        integer ( 32bit value )
        int myMinvalue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value is: " + myMinvalue);
        System.out.println("Integer maximum value is: " + myMaxValue);
//        cause and under and overflow
        System.out.println("Busted MAX value: " + (myMaxValue + 1));
        System.out.println("Busted MIN value: " + (myMinvalue - 1));

//        Byte ( 8bit value )
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("MAX Byte Value: " + maxByte);
        System.out.println("MIN Byte value: " + minByte);

//        Short ( 16bit value )
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("MAX Short value: " + maxShort);
        System.out.println("MIN Short value: " + minShort);

//        Long (64bit value)

//        when storing a long number you need to put the letter L at the end;
        long myLongNumber = 100L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("MAX Long value: " + maxLong);
        System.out.println("MIN Long value: " + minLong);

    }
}
