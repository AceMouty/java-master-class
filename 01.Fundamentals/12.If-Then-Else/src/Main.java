public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bounus = 100;

//        if (score <= 5000) {
//            System.out.println("Your score is 5000 or less");
//        } else {
//            System.out.println("Your score is greater than 5000");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bounus);
            System.out.println("Your final score is: " + finalScore);
        }

        /*
            print out a second score on the screen with the following
            score set to 10000
            levelCompeted set to 8
            bonus set to 200
            But make sure the first printout above still dsiplays as well
         */
        score = 10000;
        levelCompleted = 8;
        bounus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bounus);
            System.out.println("Your new final score is: " + finalScore);
        }

    }
}
