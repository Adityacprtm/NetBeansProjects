package chapter13;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawPolygon extends JFrame {
  public DrawPolygon() {
    setTitle("DrawPolygon");
    add(new PolygonsPanel());
  }

  /** Main method */
  public static void main(String[] args) {
    DrawPolygon frame = new DrawPolygon();
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 250);
    frame.setVisible(true);
  }
}

// Draw a polygon in the panel
class PolygonsPanel extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

    // Create a Polygon object
    Polygon polygon = new Polygon();

    // Add points to the polygon
    double angle = 0;
    for (int i = 0; i < 6; i++) {
      polygon.addPoint((int)(xCenter + radius * Math.cos(angle)), 
        (int)(yCenter - radius * Math.sin(angle)));
      
      angle += 2 * Math.PI / 6;
    }

    // Draw the polygon
    g.drawPolygon(polygon);
  }
}