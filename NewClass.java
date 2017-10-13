package TMPaint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewClass {
    
    static class Blank extends JLabel{
        Dimension minSize = new Dimension(200,200);
        
        public Blank(Color color) {
            setBackground(color);
            setOpaque(true);
            setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        
        public Dimension getMinimumSize() {
            return this.minSize;
        }
        
        public Dimension getMaximumSize() {
            return this.minSize;
        }
        
    }
    
    static class render extends JPanel implements MouseListener {
        
        int x = 200;
        int y = 200;
        
        render() {
            setPreferredSize(new Dimension(400,400));
            Blank a = new Blank(Color.RED);
            add(a);
            a.addMouseListener(this);
            addMouseListener(this);
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            this.x = e.getX();
            this.y = e.getY();
            repaint();
        }
        
        @Override
        public void mousePressed(MouseEvent e) {
            
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
        
        }
        
        @Override
        public void mouseExited(MouseEvent e){
        
        };
        
        @Override
        public void mouseEntered(MouseEvent e) {
        
        }
        
        @Override
        public void paint(Graphics g) {
            g.setColor (Color.gray);
            g.drawRect(x, y, 20, 20);
        }
    }

    private static void GUI() {
        JFrame frme = new JFrame("Testing...");
        frme.setPreferredSize(new Dimension(400, 440));
        frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frme.setResizable(true);
        
        JMenuBar redMenuBar = new JMenuBar();
        redMenuBar.setOpaque(true);
        redMenuBar.setBackground(new Color(230, 230, 230));
        redMenuBar.setPreferredSize(new Dimension(400, 40));
        
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(255, 255, 0));
        yellowLabel.setPreferredSize(new Dimension(1000,600));
        
        frme.setJMenuBar(redMenuBar);
        //frme.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        render fme = new render();
        frme.getContentPane().add(fme);
        
        frme.pack();
        frme.setVisible(true);
        
    }
    
    public static void main(String args[]) {
        GUI();
    }
    
}
