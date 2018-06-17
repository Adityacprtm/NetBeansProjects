package gui;

import java.awt.*;

public class PanelTest extends Panel {

    PanelTest() {
        setBackground(Color.BLUE); //constant in Color class
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 0)); //green
        g.setFont(new Font("Helvetica", Font.PLAIN, 16));
        g.drawString("Hello GUI World!", 30, 100);
        g.setColor(new Color(1.0f, 0, 0)); //red
        g.fillRect(30, 100, 150, 10);
    }

    public static void main(String args[]) {
        Frame f = new Frame("Testing Graphics Panel");
        PanelTest gp = new PanelTest();
        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
}
