import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            read 10 numbers from the console entered by the user and print the sum of those numbers

            Create a Scanner like we did in the previously

            Use the hasNextInt() method from the scanner to check of the user has entered an int value

            if hasNextInt() returns false print the message "Invalid Number". Continue until you have 10 numbers

            use the nextInt() method to get the number and add it to the sum.

            Hints:
                Use a while loop w/ a counter
                Close the scanner object
         */

        Scanner sc = new Scanner(System.in);

        int counter = 1;
        int totalSum = 0;

        boolean hasNextInt;

        System.out.println("I need to collect 10 numbers from you please...");
        while(counter <= 10){

            // prompt user for input
            System.out.print("Enter number #" + counter + ": ");

            // check that the user gave us a number
            hasNextInt = sc.hasNextInt();

            if(hasNextInt){
                // add to the running total sum
                totalSum += sc.nextInt();

                // handle enter key
                sc.nextLine();

                // increment counter
                counter++;
            } else {

                System.out.println("Sorry, doesnt seem that you passed a number");
                sc.nextLine();
            }

        }

        sc.close();
        System.out.println("Ok so I have a total sum of all the numbers you gave me and it looks like its: " + totalSum);



    }
}
