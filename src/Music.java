// Contains file paths of the game musics and is played using MusicPlay.java
// Varies depending on which GUI is present.

public class Music {
    static MusicPlayer splashMusic;
    static MusicPlayer menuMusic;
    static MusicPlayer gameMusic;
    static MusicPlayer resultsMusic;

    public static void splashMusic() {
        try {
            splashMusic = new MusicPlayer("/audio/splash screen.wav");
            splashMusic.play();
            new java.util.Timer().schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    try { splashMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); }
                } }, 2*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void menuMusic() {
            try {
                menuMusic = new MusicPlayer("/audio/3023 Mars Wars.wav");
                menuMusic.play();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    public static void resultsMusic() {
        try {
            resultsMusic = new MusicPlayer("/audio/Poisonous Bite.wav");
            resultsMusic.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gameMusic(String difficulty) {
        try {
            if(difficulty == "easy")
                gameMusic = new MusicPlayer("/audio/Searching for a Body.wav"); 
            if(difficulty == "moderate")
                gameMusic = new MusicPlayer("/audio/Rose Garden.wav");
            if(difficulty == "hard")
                gameMusic = new MusicPlayer("/audio/Lava monsters.wav");
            gameMusic.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}