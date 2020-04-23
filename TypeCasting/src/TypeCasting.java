public class TypeCasting {
    public static void main(String[] args){
        /*
            when doing arithmetic Java will treat numbers put into ()'s as ints by default.
            if your variables data type is something other than an int, you need to type cast
            what is in the () of your expression...
         */
        byte minByte = Byte.MIN_VALUE;
        byte myNewByte = (byte)(minByte / 2);
        System.out.println("a new small byte: " + myNewByte);
    }
}
