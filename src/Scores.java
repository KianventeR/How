// Contains data of the scoring system of the game.
// Also contains a reset to do when the game is finished.

public class Scores {
    public static int correct = 0;
    public static int wrong = 0;
    public static int questionsNum = 0;
    
    public void addScore() {
        correct++;
    }

    public void addWrong() {
        wrong++;
    }
    
    public void reset() {
        correct = 0;
        wrong = 0;
        questionsNum = 0;
    }
}
