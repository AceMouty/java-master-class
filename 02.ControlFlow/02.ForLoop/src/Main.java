public class Main {
    public static void main(String[] args) {
        // manually calculating an interest rate...
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00, 5.0));
        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.00, 6.0));

        // using a for loop to do the work for us
        // for (iterator; condition; increment / decrement)
        for(int i = 0; i < 5; i++){
            System.out.println("'i' is currently " + i);
        }

        /*
            using the for statement, call the calculateInterest method with
            the amount of 10K with an interest rate of 2,3,4,5,6,7 and 8%
            and print the results to the console.
         */

        for (double i = 1; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}
