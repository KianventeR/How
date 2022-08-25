import javax.swing.*;

public class Results extends javax.swing.JFrame {
    public Results() {
        initComponents();
    }             

    private void initComponents() {
        GAME_QUES = new javax.swing.JTextArea();
        GAME_QUES_NUM3 = new javax.swing.JLabel();
        GAME_QUES_NUM2 = new javax.swing.JLabel();
        GAME_QUES_NUM1 = new javax.swing.JLabel();
        GAME_RETURN = new javax.swing.JLabel();
        GAME_BKGD = new javax.swing.JLabel();

        try {
            java.awt.Font fsgravity = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT,
                        getClass().getClassLoader().getResourceAsStream("FS-GRAVITY.TTF"));
            java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fsgravity);
       } catch (java.io.IOException | java.awt.FontFormatException e) {
            e.printStackTrace();
       }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1288, 747));

        GAME_QUES.setEditable(false);
        GAME_QUES.setBackground(new java.awt.Color(0, 0, 0));
        GAME_QUES.setColumns(20);
        GAME_QUES.setFont(new java.awt.Font("fs gravity", 0, 30)); 
        GAME_QUES.setForeground(new java.awt.Color(204, 204, 0));
        GAME_QUES.setLineWrap(true);
        GAME_QUES.setRows(4);
        GAME_QUES.setWrapStyleWord(true);
        GAME_QUES.setBorder(null);
        GAME_QUES.setOpaque(false);

        GAME_QUES_NUM2.setFont(new java.awt.Font("fs gravity", 0, 100)); 
        GAME_QUES_NUM2.setForeground(new java.awt.Color(0, 153, 0));
        GAME_QUES_NUM2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        if(Difficulty.difficulty == "easy")
            GAME_QUES_NUM2.setText("/ 20");
        if(Difficulty.difficulty == "moderate")
            GAME_QUES_NUM2.setText("/ 15");
        if(Difficulty.difficulty == "hard") 
            GAME_QUES_NUM2.setText("/ 10");

        GAME_QUES_NUM1.setFont(new java.awt.Font("fs gravity", 0, 120)); 
        GAME_QUES_NUM1.setForeground(new java.awt.Color(255, 255, 255));
        GAME_QUES_NUM1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        GAME_QUES_NUM3.setFont(new java.awt.Font("fs gravity", 0, 100)); 
        GAME_QUES_NUM3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GAME_QUES_NUM3.setText(String.valueOf(String.format("%02d",Scores.correct)));

        if(Difficulty.difficulty == "easy"){
            if(Scores.correct == 20) {
                GAME_QUES_NUM1.setText("PERFECT!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(102, 255, 51));
                GAME_QUES.setText("You have shown great competence in Programming.");
            }
            if(Scores.correct >= 14 & Scores.correct < 20) {
                GAME_QUES_NUM1.setText("WELL DONE!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(120,190,33));
                GAME_QUES.setText("I commend your knowledge and skills in Programming! Keep challenging them and improve by playing again.");
            }
            if(Scores.correct >= 8 & Scores.correct < 14) {
                GAME_QUES_NUM1.setText("GOOD JOB!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(255,102,0));
                GAME_QUES.setText("This is an achievement! Maybe next time, when you are prepared enough, you will get a higher mark.");
            }
            if(Scores.correct >= 0 & Scores.correct < 8) {
                GAME_QUES_NUM1.setText("TRY HARDER!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(139, 15, 15));
                GAME_QUES.setText("Did you take note of the concepts you need to improve in? Do not lose hope! You can always study and play this game again to test what you have learned.");
            }
        }
        if(Difficulty.difficulty == "moderate") {
            if(Scores.correct == 15) {
                GAME_QUES_NUM1.setText("PERFECT!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(102, 255, 51));
                GAME_QUES.setText("You have shown great competence in Programming.");
            }
            if(Scores.correct >= 10 & Scores.correct < 15) {
                GAME_QUES_NUM1.setText("WELL DONE!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(120,190,33));
                GAME_QUES.setText("I commend your knowledge and skills in Programming! Keep challenging them and improve by playing again.");
            }
            if(Scores.correct >= 5 & Scores.correct < 10) {
                GAME_QUES_NUM1.setText("GOOD JOB!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(225,102,0));
                GAME_QUES.setText("This is an achievement! Maybe next time, when you are prepared enough, you will get a higher mark.");
            }
            if(Scores.correct >= 0 & Scores.correct < 5) {
                GAME_QUES_NUM1.setText("TRY HARDER!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(139, 15, 15));
                GAME_QUES.setText("Did you take note of the concepts you need to improve in? Do not lose hope! You can always study and play this game again to test what you have learned.");
            }
        }
        if(Difficulty.difficulty == "hard"){
            if(Scores.correct == 10) {
                GAME_QUES_NUM1.setText("PERFECT!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(102, 255, 51));
                GAME_QUES.setText("You have shown great competence in Programming.");
            }
            if(Scores.correct >= 7 & Scores.correct < 10) {
                GAME_QUES_NUM1.setText("WELL DONE!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(120,190,33));
                GAME_QUES.setText("I commend your knowledge and skills in Programming! Keep challenging them and improve by playing again.");
            }
            if(Scores.correct >= 4 & Scores.correct < 7) {
                GAME_QUES_NUM1.setText("GOOD JOB!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(225,102,0));
                GAME_QUES.setText("This is an achievement! Maybe next time, when you are prepared enough, you will get a higher mark.");
            }
            if(Scores.correct >= 0 & Scores.correct < 4) {
                GAME_QUES_NUM1.setText("TRY HARDER!");
                GAME_QUES_NUM3.setForeground(new java.awt.Color(139, 15, 15));
                GAME_QUES.setText("Did you take note of the concepts you need to improve in? Do not lose hope! You can always study and play this game again to test what you have learned.");
            }
        }

        GAME_RETURN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Results/RETURN HOME.png"))); 
        GAME_RETURN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_RETURNMouseClicked(evt);
            }
        });

        GAME_BKGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Results/RESULTS_BKGD.png"))); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GAME_QUES_NUM3)
                        .addGap(35, 35, 35)
                        .addComponent(GAME_QUES_NUM2))
                    .addComponent(GAME_QUES_NUM1)))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(GAME_QUES, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1160, 1160, 1160)
                .addComponent(GAME_RETURN))
            .addComponent(GAME_BKGD)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GAME_QUES_NUM1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GAME_QUES_NUM3)
                            .addComponent(GAME_QUES_NUM2))))
                .addGap(23, 23, 23)
                .addComponent(GAME_QUES, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(GAME_RETURN))
            .addComponent(GAME_BKGD)
        );

        pack();
    }

    private void GAME_RETURNMouseClicked(java.awt.event.MouseEvent evt) {        
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }
        try { Music.resultsMusic.stop(); }
        catch (Exception e) { e.printStackTrace(); }
        try { Music.menuMusic(); }
        catch (Exception e) { e.printStackTrace(); }

        How2Prog.scoring.reset();

        How2Prog.results.setVisible(false);
        How2Prog.mainMenu.setVisible(true);
        How2Prog.mainMenu.setLocationRelativeTo(null);
    }

    private javax.swing.JLabel GAME_BKGD;
    private javax.swing.JTextArea GAME_QUES;
    private javax.swing.JLabel GAME_QUES_NUM1;
    private javax.swing.JLabel GAME_QUES_NUM2;
    private javax.swing.JLabel GAME_QUES_NUM3;
    private javax.swing.JLabel GAME_RETURN;            
}
