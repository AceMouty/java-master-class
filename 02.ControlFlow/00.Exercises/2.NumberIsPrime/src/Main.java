public class Main {
    public static void main(String[] args) {
        // create a for loop and determine if a number is prime or not

        for (int i = 0; i < 300; i++){
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    // helper function to see if a number is prime or not
    public static boolean isPrime(int number) {
        if (number ==1){
            return false;
        }

        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
