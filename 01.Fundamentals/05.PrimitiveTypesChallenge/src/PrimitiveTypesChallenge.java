public class PrimitiveTypesChallenge {
    public static void main(String[] args){
        byte newByte = 3;
        short newShort = 12;
        int newInt = 300;
        long damnLong = 50000L + 10L * (newByte + newShort + newInt);
        System.out.println("Here is the long number: " + damnLong);
    }
}
