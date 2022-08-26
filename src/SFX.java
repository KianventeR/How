// Works similar to MusicPlayer.java.
// This class plays the sound effect of clicking buttions.
// Buttons vary by their respective results (e.g. wrong answer sfx, or locked button sfx when no snippets
// present in the question code).
// This differs to MusicPlayer by not looping the sound, only plays sound once.

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SFX {
    Clip clip;

    public SFX(String filePath) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(filePath));
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
    }
    
    public void play() {
        clip.start();
    }
}
