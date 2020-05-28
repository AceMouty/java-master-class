public class Main {
    public static void main(String[] args) {
        // the while loop is like a for loop except that it requires more manual work
        // create a counter and loop until some condition is met with the counter
        // you need to manually increment the counter, if you forget to do so you will have
        // an infinite loop :(

        System.out.println("*** WHILE ***");
        int counter = 0;
        while(counter <= 10){
            System.out.println("Counter is currently: " + counter);
            counter++;
        }
        System.out.println("If we are here, we made it out of the loop");

        counter = 0;  // reset counter
        while (counter != 6) {
            System.out.println("Counter is currently: " + counter);
            counter++;
        }

        System.out.println("*** DO WHILE LOOP ***");
        // do while looping: do while will ALWAYS run at least once

        counter = 0; // reset counter
        // what do we want to DO
        do {
            System.out.println("Counter is currently: " + counter);
            counter++;
        } while (counter != 8);

        // CHALLENGE
        /*
            Create a method called isEvenNumber that takes a parameter of type int
            Its purpose is to determine if the argument passed to the method is an even number or not.
            return true if an even number, otherwise return false;
         */

        int start = 4;
        int finishNum = 20;
        while(start <= finishNum){
            System.out.println(start + " is an equal number: " + isEvenNumber(start));
            start ++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
