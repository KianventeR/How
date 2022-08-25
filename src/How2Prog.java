public class How2Prog {
    static int first = 0;
    
    public static MainMenu mainMenu = new MainMenu();
    public static SplashScreen splashScreen = new SplashScreen();
    public static Instructions instructions = new Instructions();
    public static Difficulty difficulty = new Difficulty();
    public static Results results;
    public static QuestionSheet sheet = new QuestionSheet();
    public static Scores scoring = new Scores();

    public static int first() { return first; }
    
    public static void main(String[] args) {
        Music.splashMusic();
        splashScreen.setVisible(true);
        splashScreen.setLocationRelativeTo(null);

        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                splashScreen.dispose();
                Music.menuMusic();
                mainMenu.setVisible(true);
                mainMenu.setLocationRelativeTo(null);
                first++;
            } }, 3*1100);
    }
}
