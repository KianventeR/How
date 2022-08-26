// This class contains the GUI of the Instructions section.
// It is simply an image displayed, but added a return button to go back to menu.

import javax.swing.*;

public class Instructions extends JFrame {
    public Instructions() {
        initComponents();
    }
                     
    private void initComponents() {
        HOW2PLAY_RETURN = new JLabel();
        HOW2PLAY_BKGD = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 750));

        HOW2PLAY_RETURN.setIcon(new ImageIcon(getClass().getResource("/images/Instructions/RETURN.png")));
        HOW2PLAY_RETURN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOW2PLAY_RETURNMouseClicked(evt);
            }
        });

        HOW2PLAY_BKGD.setIcon(new ImageIcon(getClass().getResource("/images/Instructions/INSTRUCTIONS.png")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1170, 1170, 1170)
                .addComponent(HOW2PLAY_RETURN))
            .addComponent(HOW2PLAY_BKGD, GroupLayout.PREFERRED_SIZE, 1400, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(HOW2PLAY_RETURN))
            .addComponent(HOW2PLAY_BKGD)
        );
        pack();
    }                  

    private void HOW2PLAY_RETURNMouseClicked(java.awt.event.MouseEvent evt) {   
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }                                          
        How2Prog.instructions.setVisible(false);
        How2Prog.mainMenu.setVisible(true);
        How2Prog.mainMenu.setLocationRelativeTo(null);
    }                                            
                    
    private JLabel HOW2PLAY_BKGD;
    private JLabel HOW2PLAY_RETURN;                   
}
