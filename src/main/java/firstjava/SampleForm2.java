package firstjava;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class SampleForm2 {
    public static void main(String[] args) {
        var f = new JFrame("drawing");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var lbl = new JLabel("테스트");
        f.add(lbl);
        f.pack();

        var img = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        lbl.setIcon(new ImageIcon(img));
        f.pack();

        var g = img.createGraphics();
        g.drawLine(0, 0, 600, 400);
        g.setColor(java.awt.Color.BLUE);
        g.fillRect(300, 200, 120, 100);
        lbl.repaint();

        g.drawLine(0, 400, 600, 0);
        g.setColor(java.awt.Color.RED);
        g.fillOval(100, 100, 100, 100);
        f.setVisible(true);
    }
}
