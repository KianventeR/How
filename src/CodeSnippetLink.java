// Displays Code Snippet that shows the question's code snippet when clicking
// its respective button (to the right of the question).

// Works only if there is a Code Snippet on the question, else plays an error sound.

public class CodeSnippetLink extends javax.swing.JFrame {
    public CodeSnippetLink() {
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

    private javax.swing.JLabel codeSnippet;
    public String filePath;
}
