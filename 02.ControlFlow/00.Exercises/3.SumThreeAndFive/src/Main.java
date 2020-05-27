public class Main {
    public static void main(String[] args) {
        /*
            Create a for loop using a range of number from 1 to 1000 INCLUSIVE.
            Sum all the number that can be divided with both 3 and also with 5.
            For those numbers that met the above conditions, print out the number.
            break out of the loop once you find 5 numbers that met the above conditions
            After breaking out foo the loop print the SUM of the numbers that met the above conditions
         */
        int totalSum = 0;
        int counter = 0;

        for(int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("i is currently " + i + ", adding to the total sum");
                counter += 1;
                totalSum += i;
            }

            if (counter == 5) {
                break;
            }
        }

        System.out.println("Counter is currently " + counter);
        System.out.println("The total sum of the numbers is: " + totalSum );
    }
}
