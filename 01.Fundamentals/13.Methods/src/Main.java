import java.lang.reflect.Array;

public class Main {

//    main method
    public static void main(String[] args) {

        /*
            when using a method you can pass hard coded values OR you can pass in varibales
            that hold the data that you want the method to act on.
         */

//        here we user variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bounus = 100;
        calculateScore(gameOver, score, levelCompleted, bounus);

//        here we just hard code in the values
        calculateScore(true, 10000, 8, 200);

        // call a method that has a return value in it
        int finalScore = returnFinalScore(false, score, levelCompleted, bounus);
        // check to see if the game was over or not
        if (finalScore == -1) {
            System.out.println("The game is not over yet...");
        } else {
            System.out.println("Your final score is... " + finalScore);
        }

        /*
            Create a method called displayHighScorePosition
            it should take a players name as a parameter, and a 2nd parameter as a position in the high score table.
            You should display the players name along with a message like "managed to get into position " and the
            position they got and further message " on the high score table"

            Create a 2nd method called calculateHighScorePosition
            it should be sent one argument only, the player score.
            it should return an int
            the return...
            1 if the score is > 100
            2 if the score is > 500 and < 1000
            3 if the score is > 100 and < 500
            4 in all other cases
            call both the methods and display the results of the following
            a score of 1500, 900, 400, and 50

         */

        // create a Array that is pre-populated
       int[] scoresArray = {1500, 900, 400, 50};
       String[] playerNames = {"John", "Jimmy", "Jane", "Jillian"};

       // for loop where we will use i to access data from both arrays in a single pass
       for (int i = 0; i < 4; i++) {
           int rank = calculateRank(scoresArray[i]);
           displayMessage(playerNames[i], rank);
       }


    }

//    create a new method

    // void: DONT return anything, if you want to return a value then you need to replace void with the
    // data type that is going to be returned
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("This is your final score: " + finalScore);
        }

    }

    // here we have a method that has a return that is of type int
    public static int returnFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // check to see if game over is false
        if(!gameOver) { return -1; }

        return score + (levelCompleted * bonus);

    }

    public static void displayMessage(String playerName, int rank) {
        System.out.println(playerName + " ranks number " + rank + " on the leader board");
    }

    public static int calculateRank(int score) {
        /*
            1 if the score is > 1000
            2 if the score is > 500 and < 1000
            3 if the score is > 100 and < 500
            4 in all other cases
         */

        // we assume the worst case scenario here
        int rank = 4;
        if (score >= 1000) {
            rank = 1;
        } else if ( score >= 500 && score < 1000) {
            rank = 2;
        } else if ( score >= 100 && score < 500) {
            rank = 3;
        }

        return rank;
    }
}
