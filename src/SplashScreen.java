import javax.swing.*;

public class SplashScreen extends JFrame {
    public SplashScreen() {
        initComponents();
    }
                       
    private void initComponents() {
        SPLASH_GEAR = new JLabel();
        SPLASH_GEAR2 = new JLabel();
        SPLASH_HOWTO = new JLabel();
        SPLASH_PROG = new JLabel();
        SPLASH_BKGD = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1288, 747));
        setMinimumSize(new java.awt.Dimension(1288, 747));
        setPreferredSize(new java.awt.Dimension(1288, 747));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 750));

        SPLASH_GEAR.setIcon(new ImageIcon(getClass().getResource("/images/SplashScreen/GEAR CODE.png")));

        SPLASH_GEAR2.setIcon(new ImageIcon(getClass().getResource("/images/SplashScreen/GEAR DOT.png")));

        SPLASH_HOWTO.setIcon(new ImageIcon(getClass().getResource("/images/SplashScreen/HOW TO.png")));

        SPLASH_PROG.setIcon(new ImageIcon(getClass().getResource("/images/SplashScreen/PROGRAMMING.png")));

        SPLASH_BKGD.setIcon(new ImageIcon(getClass().getResource("/images/SplashScreen/BACKGROUND.png")));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(SPLASH_GEAR2))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(SPLASH_PROG))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SPLASH_HOWTO))
            .addGroup(layout.createSequentialGroup()
                .addGap(1020, 1020, 1020)
                .addComponent(SPLASH_GEAR))
            .addComponent(SPLASH_BKGD, GroupLayout.PREFERRED_SIZE, 1400, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(SPLASH_GEAR2)
                .addGap(180, 180, 180)
                .addComponent(SPLASH_PROG))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(SPLASH_HOWTO))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(SPLASH_GEAR))
            .addComponent(SPLASH_BKGD)
        );

        pack();
    }
              
    private JLabel SPLASH_BKGD;
    private JLabel SPLASH_GEAR;
    private JLabel SPLASH_GEAR2;
    private JLabel SPLASH_HOWTO;
    private JLabel SPLASH_PROG;               
}