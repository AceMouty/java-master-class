public class Main {
    public static void main(String[] args) {
        /*
            Primitives:
             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

             The most common ones that will be used are int, double and boolean. Sometimes char

             STRING
                The String is a datatype in Java, not a Primitive type. String is actually a class, but is the
                one used most often when working with.....Strings.


                The max length of a string is actually limited to the the same MAX_VALUE of an int, which
                was 2.14 Billion. So a string can hold up to 2.14 billion characters in it.

                Java will also coerce our data for us. If you are adding a string to a number type of any kind.
                Java will turn the number into a string and then perform the operation.

                Strings are a immutable datatype. So when you delete a character or add in a new one, Java will actually
                make a copy of the original and then perform the operation provided eg. insert / delete characters.
                So when we say myStr + ... what is actually happening is Java creates a new string under the hood
                and combines the old string value with the new string value and GC's the old string state / value.
                This is super inefficient and there is a way to make it faster, with a StringBuffer.
         */

        String myStr = "This is a string";
        System.out.println("my string is equal to " + myStr);
        myStr = myStr + ", and this is more added to my string";
        System.out.println(myStr);
        System.out.println("my string is equal to " + myStr);
        myStr = myStr + " \u00A9 2019";
        System.out.println("my string is equal to " + myStr);
        System.out.println(myStr + " " + 22);



    }
}
