public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);

        // this is the instance of the overloaded method.
        int anonScore = calculateScore(300);
        System.out.println("The Anon score is: " + anonScore);

        // another instance of calculateScore with no params
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(-1, 12);
        if (centimeters < 0.0) {
            System.out.println("Invalid params");
        } else {
            System.out.println("How many centimeters are in 3ft? " + centimeters);
        }

        double inchToCentimeters = calcFeetAndInchesToCentimeters(48);
        if (inchToCentimeters < 0.0) {
            System.out.println("Invalid params");
        } else {
            System.out.println("How many cm in 48 in? " + inchToCentimeters);
        }

    }

    /*
        Method overloading is when we have a method with the same
        name defined multiple times but the method takes in different parameters
        each time.

        Java knows what is an inst an overload based on the methods signature. The signature
        is made up of
        1. The method name
        2. The params of a method

        Simply changing the return type on a method will not work when overloading, you must have a different
        set of parameters for the method
     */

    // first instance of claculateScore
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " pts");
        return score * 1000;
    }

    // second instance that will be the overload
    public static int calculateScore(int score) {
        System.out.println("An UNKNOWN player has scored " + score + " pts");
        return score * 1000;
    }

    // third instance of the method that will take in no params
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // creating our own method and overloading it now

    /*
        Create a method called calcFeetAndInchesToCentimeters
        It needs to have two params
        1. feet in the first param
        2. inches in the seconds param

        You should validate that the first param feet is >= 0
        You should validate that the 2nd param inches is >= 0 and <= 12
        return -1 from the method if either of the above is not true

        If the params are valid then calculate how many centimeters
        comprise the feet and inches passed to this method and return that value.

        Create a 2nd method of the same name but with only one param
        1. inches

        validate that value is >=0
        return -1 if it is not true
        but if its valid, then calculate how many feet are in the inches
        and then here is the tricky part

        call the other overloaded method passing the correct feet and inches
        calculated so that in can calculate correctly

        hints: use doubles for your number datatype
        1 inch = 2.54cm
        1 foot = 12in
     */


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        // sanity check the values passed to us
        if (!(feet >= 0))
        {
            return -1;
        }

        if (!(inches >= 0 && inches <= 12))
        {
            return -1;
        }

        // conversion variables
        int inchesInAFoot = 12;
        double inchesInACentimeter = 2.54;

        // convert values passed
        int feetToInches = feet * inchesInAFoot;
        int totalInches = feetToInches + inches;

        // result
        double totalCentimeters = (double) totalInches * inchesInACentimeter;
        return totalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        // check input given
        if(! (inches >=0 && inches <= 12))
        {
            return -1;
        }

        double inchesToCentimeters = 2.54;
        double totalCentimeters = (double) inches * inchesToCentimeters;
        return totalCentimeters;
    }

}
