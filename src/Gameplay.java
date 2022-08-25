import java.net.URL;

import javax.swing.*;

public class Gameplay extends JFrame {
    public Gameplay() {
        initComponents();
    }
                       
    private void initComponents() {
        GAME_D = new javax.swing.JTextArea();
        GAME_C = new javax.swing.JTextArea();
        GAME_B = new javax.swing.JTextArea();
        GAME_A = new javax.swing.JTextArea();
        GAME_BORDER_D = new javax.swing.JTextArea();
        GAME_BORDER_C = new javax.swing.JTextArea();
        GAME_BORDER_B = new javax.swing.JTextArea();
        GAME_BORDER_A = new javax.swing.JTextArea();
        GAME_LINK1 = new javax.swing.JLabel();
        GAME_LINK = new javax.swing.JLabel();
        GAME_QUES = new javax.swing.JTextArea();
        GAME_QUES_NUM = new javax.swing.JLabel();
        GAME_SCORE_TITLE = new javax.swing.JLabel();
        GAME_SCORE_WRONG = new javax.swing.JLabel();
        GAME_SCORE_WRONG2 = new javax.swing.JLabel();
        GAME_SCORE_CORRECT = new javax.swing.JLabel();
        GAME_SCORE_CORRECT2 = new javax.swing.JLabel();
        GAME_RETURN = new javax.swing.JLabel();
        GAME_VOL = new javax.swing.JLabel();
        GAME_BKGD = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1288, 747));

        try {
            java.awt.Font fsgravity = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT,
                        getClass().getClassLoader().getResourceAsStream("FS-GRAVITY.TTF"));
            java.awt.GraphicsEnvironment ge = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fsgravity);
       } catch (java.io.IOException | java.awt.FontFormatException e) {
            e.printStackTrace();
       }

        GAME_D.setEditable(false);
        GAME_D.setBackground(new java.awt.Color(0, 0, 0));
        GAME_D.setColumns(20);
        GAME_D.setFont(new java.awt.Font("fs gravity", 0, 18));
        GAME_D.setForeground(new java.awt.Color(255, 255, 255));
        GAME_D.setLineWrap(true);
        GAME_D.setRows(4);
        GAME_D.setText(How2Prog.sheet.D);
        GAME_D.setWrapStyleWord(true);
        GAME_D.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        GAME_D.setKeymap(null);
        GAME_D.setMaximumSize(new java.awt.Dimension(390, 90));
        GAME_D.setMinimumSize(new java.awt.Dimension(390, 90));
        GAME_D.setPreferredSize(new java.awt.Dimension(390, 90));
        GAME_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_DMouseClicked(evt);
            }
        });

        GAME_C.setEditable(false);
        GAME_C.setBackground(new java.awt.Color(0, 0, 0));
        GAME_C.setColumns(20);
        GAME_C.setFont(new java.awt.Font("fs gravity", 0, 18));
        GAME_C.setForeground(new java.awt.Color(255, 255, 255));
        GAME_C.setLineWrap(true);
        GAME_C.setRows(4);
        GAME_C.setText(How2Prog.sheet.C);
        GAME_C.setWrapStyleWord(true);
        GAME_C.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        GAME_C.setKeymap(null);
        GAME_C.setMaximumSize(new java.awt.Dimension(390, 90));
        GAME_C.setMinimumSize(new java.awt.Dimension(390, 90));
        GAME_C.setPreferredSize(new java.awt.Dimension(390, 90));
        GAME_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_CMouseClicked(evt);
            }
        });

        GAME_B.setEditable(false);
        GAME_B.setBackground(new java.awt.Color(0, 0, 0));
        GAME_B.setColumns(20);
        GAME_B.setFont(new java.awt.Font("fs gravity", 0, 18));
        GAME_B.setForeground(new java.awt.Color(255, 255, 255));
        GAME_B.setLineWrap(true);
        GAME_B.setRows(4);
        GAME_B.setText(How2Prog.sheet.B);
        GAME_B.setWrapStyleWord(true);
        GAME_B.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        GAME_B.setKeymap(null);
        GAME_B.setMaximumSize(new java.awt.Dimension(390, 90));
        GAME_B.setMinimumSize(new java.awt.Dimension(390, 90));
        GAME_B.setPreferredSize(new java.awt.Dimension(390, 90));
        GAME_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_BMouseClicked(evt);
            }
        });

        GAME_A.setEditable(false);
        GAME_A.setBackground(new java.awt.Color(0, 0, 0));
        GAME_A.setColumns(20);
        GAME_A.setFont(new java.awt.Font("fs gravity", 0, 18));
        GAME_A.setForeground(new java.awt.Color(255, 255, 255));
        GAME_A.setLineWrap(true);
        GAME_A.setRows(4);
        GAME_A.setText(How2Prog.sheet.A);
        GAME_A.setWrapStyleWord(true);
        GAME_A.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        GAME_A.setKeymap(null);
        GAME_A.setMaximumSize(new java.awt.Dimension(390, 90));
        GAME_A.setMinimumSize(new java.awt.Dimension(390, 90));
        GAME_A.setPreferredSize(new java.awt.Dimension(390, 90));
        GAME_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_AMouseClicked(evt);
            }
        });

        GAME_BORDER_D.setEditable(false);
        GAME_BORDER_D.setBackground(new java.awt.Color(0, 0, 0));
        GAME_BORDER_D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 18));
        GAME_BORDER_D.setMaximumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_D.setMinimumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_D.setPreferredSize(new java.awt.Dimension(430, 130));

        GAME_BORDER_C.setEditable(false);
        GAME_BORDER_C.setBackground(new java.awt.Color(0, 0, 0));
        GAME_BORDER_C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 18));
        GAME_BORDER_C.setMaximumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_C.setMinimumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_C.setPreferredSize(new java.awt.Dimension(430, 130));

        GAME_BORDER_B.setEditable(false);
        GAME_BORDER_B.setBackground(new java.awt.Color(0, 0, 0));
        GAME_BORDER_B.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 18));
        GAME_BORDER_B.setMaximumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_B.setMinimumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_B.setPreferredSize(new java.awt.Dimension(430, 130));

        GAME_BORDER_A.setEditable(false);
        GAME_BORDER_A.setBackground(new java.awt.Color(0, 0, 0));
        GAME_BORDER_A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 18));
        GAME_BORDER_A.setMaximumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_A.setMinimumSize(new java.awt.Dimension(430, 130));
        GAME_BORDER_A.setPreferredSize(new java.awt.Dimension(430, 130));

        GAME_LINK1.setFont(new java.awt.Font("fs gravity", 0, 23));
        GAME_LINK1.setForeground(new java.awt.Color(255, 255, 255));
        GAME_LINK1.setText("code");

        GAME_LINK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gameplay/GAME_LINK.png")));
        GAME_LINK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_LINKMouseClicked(evt);
            }
        });
        

        GAME_QUES.setEditable(false);
        GAME_QUES.setBackground(new java.awt.Color(0, 0, 0));
        GAME_QUES.setColumns(20);
        GAME_QUES.setFont(new java.awt.Font("fs gravity", 0, 24));
        GAME_QUES.setForeground(new java.awt.Color(255, 255, 255));
        GAME_QUES.setLineWrap(true);
        GAME_QUES.setRows(4);
        GAME_QUES.setText(How2Prog.sheet.Ques);
        GAME_QUES.setWrapStyleWord(true);
        GAME_QUES.setBorder(null);
        GAME_QUES.setOpaque(false);
        GAME_QUES.setPreferredSize(new java.awt.Dimension(600, 104));

        GAME_QUES_NUM.setFont(new java.awt.Font("fs gravity", 0, 100)); 
        GAME_QUES_NUM.setForeground(new java.awt.Color(255, 255, 255));
        GAME_QUES_NUM.setText(String.format("QUESTION #%02d", Scores.questionsNum));

        GAME_SCORE_TITLE.setFont(new java.awt.Font("fs gravity", 0, 100));
        GAME_SCORE_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        GAME_SCORE_TITLE.setText("SCORES");

        GAME_SCORE_WRONG.setFont(new java.awt.Font("fs gravity", 0, 80));
        GAME_SCORE_WRONG.setForeground(new java.awt.Color(153, 0, 0));
        GAME_SCORE_WRONG.setText(String.format("%02d", Scores.wrong));

        GAME_SCORE_WRONG2.setFont(new java.awt.Font("fs gravity", 0, 55));
        GAME_SCORE_WRONG2.setForeground(new java.awt.Color(255, 0, 0));
        GAME_SCORE_WRONG2.setText("WRONG");

        GAME_SCORE_CORRECT.setFont(new java.awt.Font("fs gravity", 0, 80));
        GAME_SCORE_CORRECT.setForeground(new java.awt.Color(0, 153, 0));
        GAME_SCORE_CORRECT.setText(String.format("%02d", Scores.correct));

        GAME_SCORE_CORRECT2.setFont(new java.awt.Font("fs gravity", 0, 55));
        GAME_SCORE_CORRECT2.setForeground(new java.awt.Color(51, 204, 0));
        GAME_SCORE_CORRECT2.setText("RIGHT");

        GAME_RETURN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gameplay/RETURN HOME.png")));
        GAME_RETURN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_RETURNMouseClicked(evt);
            }
        });

        GAME_VOL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gameplay/GAME_VOL_ON.png")));
        GAME_VOL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GAME_VOLMouseClicked(evt);
            }
        });

        GAME_BKGD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gameplay/GAME_BKGD.jpg")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1050, 1050, 1050)
                .addComponent(GAME_LINK1))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(GAME_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(GAME_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180)
                .addComponent(GAME_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(GAME_SCORE_WRONG2))
            .addGroup(layout.createSequentialGroup()
                .addGap(1160, 1160, 1160)
                .addComponent(GAME_RETURN))
            .addGroup(layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(GAME_SCORE_WRONG))
            .addGroup(layout.createSequentialGroup()
                .addGap(1020, 1020, 1020)
                .addComponent(GAME_LINK))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(GAME_BORDER_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(GAME_BORDER_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(730, 730, 730)
                .addComponent(GAME_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(GAME_SCORE_CORRECT))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(GAME_BORDER_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GAME_VOL))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(GAME_BORDER_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(GAME_QUES, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(GAME_QUES_NUM))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(GAME_SCORE_CORRECT2))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(GAME_SCORE_TITLE))
            .addComponent(GAME_BKGD)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(GAME_LINK1)
                .addGap(145, 145, 145)
                .addComponent(GAME_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GAME_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GAME_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(GAME_SCORE_WRONG2))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(GAME_RETURN))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(GAME_SCORE_WRONG))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(GAME_LINK))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(GAME_BORDER_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(GAME_BORDER_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(GAME_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(GAME_SCORE_CORRECT))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(GAME_BORDER_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(GAME_VOL))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(GAME_BORDER_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(GAME_QUES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(GAME_QUES_NUM))
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(GAME_SCORE_CORRECT2))
            .addGroup(layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(GAME_SCORE_TITLE))
            .addComponent(GAME_BKGD)
        );

        pack();
    }                     

    private void GAME_VOLMouseClicked(java.awt.event.MouseEvent evt) { 
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        if(mute == true) {
            try { Music.gameMusic.resume(); }
            catch (Exception e) { e.printStackTrace(); }
            GAME_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Gameplay/GAME_VOL_ON.png")));
            mute = false;
        }else {
            GAME_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Gameplay/GAME_VOL_OFF.png")));
            try { Music.gameMusic.pause(); }
            catch (Exception e) { e.printStackTrace(); }
            mute = true;
        }
    }   
    
    private void GAME_RETURNMouseClicked(java.awt.event.MouseEvent evt) {    
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }                                     
        try { Music.gameMusic.stop(); }
        catch (Exception e) { e.printStackTrace(); } 
        try { Music.resultsMusic(); }
        catch (Exception e) { e.printStackTrace(); } 
        code.dispose();
        this.setVisible(false);
        How2Prog.results = new Results();
        How2Prog.results.setVisible(true);
        How2Prog.results.setLocationRelativeTo(null);
    }   

    private void GAME_LINKMouseClicked(java.awt.event.MouseEvent evt) {  
        if(How2Prog.sheet.hasLink) {
            try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
            catch (Exception e) { e.printStackTrace(); }
            QuestionSheet.gameplay.setStoredIcon(How2Prog.sheet.urlLink); 
            CodeSnippetLink code = new CodeSnippetLink();
            code.setVisible(true);
            code.setLocationRelativeTo(null);
            new java.util.Timer().schedule(new java.util.TimerTask() {
                @Override
                public void run() {
                    code.dispose();
                } }, 10*1000);
        }else {
            try { SFX sfx = new SFX("/audio/x button.wav"); sfx.play(); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
    
    private void GAME_AMouseClicked(java.awt.event.MouseEvent evt) {  
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        if(How2Prog.sheet.hasLinkA) {
            QuestionSheet.gameplay.setStoredIcon(How2Prog.sheet.urlA); 
            if(How2Prog.sheet.answerIntFinal == 0)
                answer = true;
            code = new CodeSnippet();
            code.setVisible(true);
            code.setLocationRelativeTo(null);
        } else {
            if(How2Prog.sheet.answerIntFinal == 0) {
                Scores.correct++;
                QuestionSheet.gameplay.dispose();  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }
            }else {
                Scores.wrong++;
                QuestionSheet.gameplay.dispose();  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }
            }
        }
    }                                   

    private void GAME_BMouseClicked(java.awt.event.MouseEvent evt) { 
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        if(How2Prog.sheet.hasLinkB) {
            QuestionSheet.gameplay.setStoredIcon(How2Prog.sheet.urlB); 
            if(How2Prog.sheet.answerIntFinal == 1)
                answer = true;
            code = new CodeSnippet();
            code.setVisible(true);
            code.setLocationRelativeTo(null);
        }else {
            if(How2Prog.sheet.answerIntFinal == 1) {
                Scores.correct++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }
            }else {
                Scores.wrong++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }  
            }
        }
    }                                   

    private void GAME_CMouseClicked(java.awt.event.MouseEvent evt) { 
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        if(How2Prog.sheet.hasLinkC) {
            QuestionSheet.gameplay.setStoredIcon(How2Prog.sheet.urlC); 
            if(How2Prog.sheet.answerIntFinal == 2)
                answer = true;
            code = new CodeSnippet();
            code.setVisible(true);
            code.setLocationRelativeTo(null);
            new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                code.dispose();
            } }, 10*1000);
        }else {
            if(How2Prog.sheet.answerIntFinal == 2) {
                Scores.correct++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }
            }else {
                Scores.wrong++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }
            }
        }
    }                                   

    private void GAME_DMouseClicked(java.awt.event.MouseEvent evt) { 
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }
                                           
        if(How2Prog.sheet.hasLinkD) {
            QuestionSheet.gameplay.setStoredIcon(How2Prog.sheet.urlD); 
            if(How2Prog.sheet.answerIntFinal == 3)
                answer = true;  
            code = new CodeSnippet();
            code.setVisible(true);
            code.setLocationRelativeTo(null);
        }else {
            if(How2Prog.sheet.answerIntFinal == 3) {
                Scores.correct++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                }  
            }else {
                Scores.wrong++;
                QuestionSheet.gameplay.setVisible(false);  
                if(Scores.questionsNum < How2Prog.sheet.questionsMaxNum)
                    How2Prog.sheet.displayQuestion();
                else {
                    try { Music.gameMusic.stop(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    try { Music.resultsMusic(); }
                    catch (Exception e) { e.printStackTrace(); } 
                    How2Prog.results = new Results();
                    How2Prog.results.setVisible(true);
                    How2Prog.results.setLocationRelativeTo(null);
                } 
            }
        }
    }       
    public void setStoredIcon(URL url) {
        filePath = url;
    }
                 
    private javax.swing.JTextArea GAME_A;
    private javax.swing.JTextArea GAME_B;
    private javax.swing.JLabel GAME_BKGD;
    private javax.swing.JTextArea GAME_BORDER_A;
    private javax.swing.JTextArea GAME_BORDER_B;
    private javax.swing.JTextArea GAME_BORDER_C;
    private javax.swing.JTextArea GAME_BORDER_D;
    private javax.swing.JTextArea GAME_C;
    private javax.swing.JTextArea GAME_D;
    private javax.swing.JLabel GAME_LINK;
    private javax.swing.JLabel GAME_LINK1;
    private javax.swing.JTextArea GAME_QUES;
    private javax.swing.JLabel GAME_QUES_NUM;
    private javax.swing.JLabel GAME_RETURN;
    private javax.swing.JLabel GAME_SCORE_CORRECT;
    private javax.swing.JLabel GAME_SCORE_CORRECT2;
    private javax.swing.JLabel GAME_SCORE_TITLE;
    private javax.swing.JLabel GAME_SCORE_WRONG;
    private javax.swing.JLabel GAME_SCORE_WRONG2;
    private javax.swing.JLabel GAME_VOL;    
    
    private boolean mute = false;
    public URL filePath;
    public CodeSnippet code;
    public boolean answer = false;
}
