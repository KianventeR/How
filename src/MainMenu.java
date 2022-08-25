import javax.swing.*;

public class MainMenu extends JFrame {    
    public MainMenu() {
        initComponents();
    }
                       
    public void initComponents() {
        MENU_PLAY = new JLabel();
        MENU_TITLE = new JLabel();
        MENU_HOW = new JLabel();
        MENU_CLOSE = new JLabel();
        MENU_VOL = new JLabel();
        MENU_BKGD = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1288, 747));

        MENU_PLAY.setIcon(new ImageIcon(getClass().getResource("/images/Menu/PLAY.png")));
        MENU_PLAY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_PLAYMouseClicked(evt);
            }
        });

        MENU_TITLE.setIcon(new ImageIcon(getClass().getResource("/images/Menu/TITLE.png")));

        MENU_HOW.setIcon(new ImageIcon(getClass().getResource("/images/Menu/HOW TO PLAY.png")));
        MENU_HOW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_HOWMouseClicked(evt);
            }
        });

        MENU_CLOSE.setIcon(new ImageIcon(getClass().getResource("/images/Menu/CLOSE.png")));
        MENU_CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_CLOSEMouseClicked(evt);
            }
        });
        
        if(How2Prog.first() == 0) {
            MENU_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Menu/VOL ON.png")));
            mute = false;
        }else {
            if(mute == false) {
                try { Music.menuMusic.resume(); }
                catch (Exception e) { e.printStackTrace(); }
                MENU_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Menu/VOL ON.png")));
            }
            if(mute == true) {
                try { Music.menuMusic.pause(); }
                catch (Exception e) { e.printStackTrace(); }
                MENU_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Menu/VOL OFF.png")));
            }
        }
        
            
        MENU_VOL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_VOLMouseClicked(evt);
            }
        });

        MENU_BKGD.setIcon(new ImageIcon(getClass().getResource("/images/Menu/BACKGROUND.png")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1080, 1080, 1080)
                .addComponent(MENU_VOL)
                .addGap(0, 0, 0)
                .addComponent(MENU_CLOSE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(MENU_PLAY))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(MENU_TITLE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(MENU_HOW))
            .addComponent(MENU_BKGD, GroupLayout.PREFERRED_SIZE, 1400, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(MENU_VOL))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(MENU_CLOSE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(MENU_PLAY))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(MENU_TITLE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(MENU_HOW))
            .addComponent(MENU_BKGD)
        );
        pack();
    }                      

    public void MENU_PLAYMouseClicked(java.awt.event.MouseEvent evt) {  
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }
        How2Prog.mainMenu.setVisible(false);
        How2Prog.difficulty.setVisible(true);
        How2Prog.difficulty.setLocationRelativeTo(null);
    }                                      

    public void MENU_HOWMouseClicked(java.awt.event.MouseEvent evt) {   
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }
        How2Prog.mainMenu.setVisible(false);
        How2Prog.instructions.setVisible(true);
        How2Prog.instructions.setLocationRelativeTo(null);
    }                                     

    public void MENU_CLOSEMouseClicked(java.awt.event.MouseEvent evt) {
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        System.exit(0);
    }                                       
    
    
    public void MENU_VOLMouseClicked(java.awt.event.MouseEvent evt) {   
        try { SFX sfx = new SFX("/audio/button.wav"); sfx.play(); }
        catch (Exception e) { e.printStackTrace(); }

        if(mute == true) {
            try { Music.menuMusic.resume(); }
            catch (Exception e) { e.printStackTrace(); }
            MENU_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Menu/VOL ON.png")));
            mute = false;
        }else {
            MENU_VOL.setIcon(new ImageIcon(getClass().getResource("/images/Menu/VOL OFF.png")));
            try { Music.menuMusic.pause(); }
            catch (Exception e) { e.printStackTrace(); }
            mute = true;
        }
    }

    public boolean getMuteStatus(){
        return this.mute;
    }
    
    
    private JLabel MENU_BKGD;
    private JLabel MENU_CLOSE;
    private JLabel MENU_HOW;
    private JLabel MENU_PLAY;
    private JLabel MENU_TITLE;
    private JLabel MENU_VOL;

    private boolean mute;
}
