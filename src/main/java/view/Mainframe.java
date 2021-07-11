package view;

import javax.swing.*;

import java.awt.*;

import static controller.Config.*;

public class Mainframe extends JFrame {

    private GamePanel gamePanel;

    public Mainframe() {
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Game Of Life 3D");
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(FRAME_BG_COLOUR);
        initPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void initPanel() {
        gamePanel = new GamePanel();
        this.add(gamePanel);
    }
}
