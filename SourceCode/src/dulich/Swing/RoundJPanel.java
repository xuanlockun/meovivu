/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dulich.Swing;

/**
 *
 * @author ACER
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundJPanel extends JPanel {
        public RoundJPanel() {
            setOpaque(false);
        }
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(new Color(195, 243, 255));
            g2d.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 40,40);
            super.paintComponent(g2d);
        }
    }
