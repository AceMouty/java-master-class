public class Main {
    public static void main(String[] args){
        // expression: kilometers = 100 * 1.609344
        // the expression has to do with evaluation or assignment.

        // miles to kilometers: 1 mile = 1.609344 kilometers
        double kilometers = 100 * 1.609344;
        System.out.println(kilometers);

        /*
            expressions below:
             highScore = 50
             highScore == 50
             ("Your Highscore is 50")
             When using a method the expression is what goes inside the parans
         */
        int highScore = 50;
        if (highScore == 50){
            System.out.println("Your high score is 50");
        }

        /*
            What parts of the below are expressions?

            score = 100
            score > 99
            ("You got the high score!")
            score = 0
         */

        int score = 100;
        if (score > 90) {
            System.out.println("You got the high score!");
            score = 0;
        }

    }
}
