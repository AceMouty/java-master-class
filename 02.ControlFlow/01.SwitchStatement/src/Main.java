public class Main {
    public static void main(String[] args)
    {
        int value = 1;
//        if (value == 1)
//        {
//            System.out.println("The value equals 1");
//        }
//        else if (value == 2)
//        {
//            System.out.println("The value equals 2");
//        }
//        else if (value == 3)
//        {
//            System.out.println("The value equals 3");
//        }

        // convert the if into a switch statement
        switch (value)
        {
            case 1:
                System.out.println("The value is equal is one");
                break;
            case 2:
                System.out.println("The value is equal to two");
                break;
            // we can also stack cases so that we can have a code block run if any of the cases match
            case 3:
            case 4:
            case 5:
                System.out.println("The value is equal to three, four or five");
                System.out.println("The value is " + value);
                break;
            default:
                System.out.println("Value not supported");
                break;
        }

        /*
            Create a new switch statement using char instead of int
            create a new char variable
            create a swi9tch statement testing for
            A, B, C, D, or E
            display a message if any of these are found and then break
            add a default which displays a message saying not found
         */

         char ranChar = 'A';

         switch (ranChar)
         {
             case 'A':
                 System.out.println("The random char is A");
                 break;
             case 'B':
                 System.out.println("The random char is B");
                 break;
             case 'C':
                 System.out.println("The random char is C");
                 break;
             case 'D':
                 System.out.println("Then random char is D");
                 break;
             case 'E':
                 System.out.println("The random char is E");
                 break;
             default:
                 System.out.println("Char passed is not supported");
                 break;
         }
    }
}
