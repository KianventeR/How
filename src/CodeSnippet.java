// Displays Code Snippets that show when a choice containing snippets is clicked.

// Works only if the choices contains snippets, else clicking only enters answer.

public class CodeSnippet extends javax.swing.JFrame {
    public CodeSnippet() {
        initComponents();
    }
                         
    private void initComponents() {
        codeSnippet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        codeSnippet.setIcon(new javax.swing.ImageIcon(QuestionSheet.gameplay.filePath));

        codeSnippet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                codeSnippetMouseExited(evt);
            }
        });
        codeSnippet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeSnippetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codeSnippet)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(codeSnippet)
        );

        pack();
    }                    

    private void codeSnippetMouseExited(java.awt.event.MouseEvent evt) {                                    
        this.dispose();
    }  
    
    private void codeSnippetMouseClicked(java.awt.event.MouseEvent evt) {  
        QuestionSheet.gameplay.setVisible(false);                             
        if(QuestionSheet.gameplay.answer == true) {
            try { SFX sfx = new SFX("/audio/y button.wav"); sfx.play(); }
            catch (Exception e) { e.printStackTrace(); }
            QuestionSheet.gameplay.answer = false;
            if(How2Prog.sheet.answerIntFinal == choice) {
                choice = 4;
                Scores.correct++;
            }
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
            this.dispose();
        }else {
            try { SFX sfx = new SFX("/audio/x button.wav"); sfx.play(); }
            catch (Exception e) { e.printStackTrace(); }
            Scores.wrong++;
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
            this.dispose();
        }
    }
    private javax.swing.JLabel codeSnippet;
    public String filePath;
    public int choice;
}
