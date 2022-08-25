import javax.swing.*;

public class Difficulty extends JFrame {
    public Difficulty() {
        initComponents();
    }
                       
    private void initComponents() {
        DIFFICULTY_EASY = new JLabel();
        DIFFICULTY_MID = new JLabel();
        DIFFICULTY_HARD = new JLabel();
        DIFFICULTY_TITLE = new JLabel();
        DIFFICULTY_RETURN = new JLabel();
        DIFFICULTY_BKGD = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1288, 747));

        DIFFICULTY_EASY.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/EASY.png")));
        DIFFICULTY_EASY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIFFICULTY_EASYMouseClicked(evt);
            }
        });

        DIFFICULTY_MID.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/MODERATE.png")));
        DIFFICULTY_MID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIFFICULTY_MIDMouseClicked(evt);
            }
        });

        DIFFICULTY_HARD.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/HARD.png")));
        DIFFICULTY_HARD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIFFICULTY_HARDMouseClicked(evt);
            }
        });

        DIFFICULTY_TITLE.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/TITLE.png")));

        DIFFICULTY_RETURN.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/RETURN.png")));
        DIFFICULTY_RETURN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DIFFICULTY_RETURNMouseClicked(evt);
            }
        });

        DIFFICULTY_BKGD.setIcon(new ImageIcon(getClass().getResource("/images/Difficulty/BACKGROUND.png")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(DIFFICULTY_TITLE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DIFFICULTY_EASY))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DIFFICULTY_HARD)
                .addGap(368, 368, 368)
                .addComponent(DIFFICULTY_RETURN))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DIFFICULTY_MID))
            .addComponent(DIFFICULTY_BKGD, GroupLayout.PREFERRED_SIZE, 1400, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(DIFFICULTY_TITLE)
                .addGap(102, 102, 102)
                .addComponent(DIFFICULTY_EASY)
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(DIFFICULTY_HARD)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(DIFFICULTY_RETURN))))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(DIFFICULTY_MID))
            .addComponent(DIFFICULTY_BKGD)
        );
        pack();
    }                      

    private void DIFFICULTY_EASYMouseClicked(java.awt.event.MouseEvent evt) {      
        difficulty = "easy";
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }  
        try { Music.menuMusic.stop(); }
        catch (Exception e) { e.printStackTrace(); } 
        try { Music.gameMusic(difficulty); }
        catch (Exception e) { e.printStackTrace(); }

        How2Prog.difficulty.setVisible(false); 
        How2Prog.sheet.setDifficulty(difficulty); 
        How2Prog.sheet.displayQuestion();
    }                                            

    private void DIFFICULTY_MIDMouseClicked(java.awt.event.MouseEvent evt) {  
        difficulty = "moderate";
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }  
        try { Music.menuMusic.stop(); }
        catch (Exception e) { e.printStackTrace(); } 
        try { Music.gameMusic(difficulty); }
        catch (Exception e) { e.printStackTrace(); }  

        How2Prog.difficulty.setVisible(false);
        How2Prog.sheet.setDifficulty(difficulty);
        How2Prog.sheet.displayQuestion(); 
    }                                           
    
    private void DIFFICULTY_HARDMouseClicked(java.awt.event.MouseEvent evt) {  
        difficulty = "hard";
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }     
        try { Music.menuMusic.stop(); }
        catch (Exception e) { e.printStackTrace(); } 
        try { Music.gameMusic(difficulty); }
        catch (Exception e) { e.printStackTrace(); }  
  
        How2Prog.difficulty.setVisible(false);
        How2Prog.sheet.setDifficulty(difficulty);
        How2Prog.sheet.displayQuestion();
    }

    private void DIFFICULTY_RETURNMouseClicked(java.awt.event.MouseEvent evt) {
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }
        How2Prog.difficulty.setVisible(false);
        How2Prog.mainMenu.setVisible(true);
        How2Prog.mainMenu.setLocationRelativeTo(null);
        How2Prog.sheet.displayQuestion();
    }           
                 
    private JLabel DIFFICULTY_TITLE;
    private JLabel DIFFICULTY_BKGD;
    private JLabel DIFFICULTY_EASY;
    private JLabel DIFFICULTY_MID;    
    private JLabel DIFFICULTY_HARD;
    private JLabel DIFFICULTY_RETURN;       
    
    public static String difficulty;
}

