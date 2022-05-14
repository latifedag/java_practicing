public class Main {
    public static void main(String[] args) {
        int topScore = 100; //expression
        if (topScore > 99){ //expression
            System.out.println("High Score!"); //expression
            topScore = 0; //expression
        }
        int variable = 50;
        variable ++;
        variable --;
        System.out.println("this is a test");
        System.out.println(variable);

        boolean gameover = true;
        int highScore = 500;
        int score = 401;
        
        if (score == highScore ){
            System.out.println("Win!");
        }
        else if (score > 250 && score < highScore) {
            System.out.println("Almost there");
        }
        else
            System.out.println("try again");

        boolean newGameOver = true;
        int newHighScore = 10000;
        int bonusSet = 200;
        int level = 8;
        int highestScore;
        highestScore = getGameScore(newGameOver, newHighScore, bonusSet, level);

        int highScorePosition = calculatingHighScorePosition(1500);
        displayHighScorePosition("Anna", highScorePosition);

        highScorePosition = calculatingHighScorePosition(900);
        displayHighScorePosition("Femke", highScorePosition);

        highScorePosition = calculatingHighScorePosition(400);
        displayHighScorePosition("Silvis", highScorePosition);

        highScorePosition = calculatingHighScorePosition(50);
        displayHighScorePosition("Natalie", highScorePosition);

        highScorePosition = calculatingHighScorePosition(500);
        displayHighScorePosition("Menno", highScorePosition);

    }

    public static int getGameScore(boolean gameOver, int score, int bonusSet, int level){
        if (gameOver){
            int finalScore = score + (bonusSet * level);
            System.out.println("final score = " + finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionInScoreTable){
        System.out.println( playerName + " managed to get into position "
                + positionInScoreTable + ". position on the high score table.");
    }

    public static int calculatingHighScorePosition(int playerScore){

    /*    if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        else
            return 4;

     */
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }
        else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}