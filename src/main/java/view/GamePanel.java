package view;

import javax.swing.*;
import java.awt.*;

import static controller.Config.PANEL_HEIGHT;
import static controller.Config.PANEL_WIDTH;

public class GamePanel extends JPanel {

    public GamePanel() {
        this.setBounds(460, 20, PANEL_WIDTH, PANEL_HEIGHT);
        this.setLayout(null);
    }

    @Override
    public void paintComponent(Graphics graphics) {

        // Init 2D graphics
        Graphics2D graphics2d = (Graphics2D) graphics;
        super.paintComponents(graphics2d);

        // Paint background
        paintBackground(graphics2d);

        // Paint grid

        // Paint cells
        graphics2d.setColor(Color.BLUE);
        graphics2d.fillRect(20, 20, 20, 20);
    }

    public void paintBackground(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
