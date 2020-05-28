import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            System.in: allows you to read input from the console.

            Scanner: Scanner is an object that allows us to read user input.

            new: 'new' will create a new instance of an object, here we create a new instance
            of a scanner object.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("What year were you born?");

        boolean hasNextInt = sc.hasNextInt();
        if (hasNextInt){

            int yearOfBirth = sc.nextInt(); // convert input to type int
            /*
                When we hit the enter key this adds in a new line to Scanner, this is then read as input
                inorder to combat this we need to skip over it by reading in the next line. Once we do that
                we can then be re-prompted for another input.

                This MUST be done when reading in a number from Scanner
            */
            sc.nextLine(); // this handles hitting the enter key

            int age = 2020 - yearOfBirth; // calculate how old someone is based on month

            if (age >= 0 && age <=100 ){
                System.out.println("That must mean that you are " + age + " years old");

                System.out.println("Enter your name");
                String name = sc.nextLine(); // will read the next line in the scanner object
                System.out.println("You told me that your name is: " + name);

            } else {
                System.out.println("There is no way you were born that year....if so time travel must be a thing now");
                System.out.println("If not....give me a valid year of birth");
            }

        } else {
            System.out.println("Uhhh are you sure you passed in a year?");
        }

        sc.close(); // this closes the scanner, and releases the memory reserved for the object.
    }
}
