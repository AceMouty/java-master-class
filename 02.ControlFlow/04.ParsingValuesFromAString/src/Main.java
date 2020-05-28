public class Main {
    public static void main(String[] args) {
        // use parsing methods to parse a string to get a primitive type out of a string.
        String numberAsString = "2020";
        System.out.println("Our string is: " + numberAsString);

        // Using the int wrapper class, we attempt to parse out an integer
        // if this fails it will throw out an error;
        int numberFromString = Integer.parseInt(numberAsString);
        System.out.println("The number generated from parseInt: " + numberFromString);

        // When adding strings to numbers, Java will type coerce the int to a String and then
        // concatenate the two strings together.
        // usually this is not what you want, you will want to  convert the string to a number, and
        // then add up two values together

        numberAsString += 1;
        System.out.println("Our string number is now: " + numberAsString);

        numberFromString += 1;
        System.out.println("Our number FROM A STRING is now: " + numberFromString);
    }
}
