public class FloatAndDouble {
    public static void main(String[] args){
//        floats hold a 32 bit precision to them and double holds 64 bit precision
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("MIN Float value: " + minFloat);
        System.out.println("MAX Float value: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("MIN Double value: " + minDouble);
        System.out.println("MAX Double value: " + maxDouble);

        int myIntValue = 5;
/*
    with decimal values doubles are the default value, you need to either type cast or
    explicitly tell Java the you want a float by putting an F at the end of the declaration.
 */
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5.25;
    }
}
