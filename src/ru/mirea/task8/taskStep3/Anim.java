package ru.mirea.task8.taskStep3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class Anim {
    private JFrame frame;
    private JPanel pane;
    private Timer timer;
    private int nextImage = 1;
    //private String[] images = {"tokyo", "tokyo2", "starwars"};
    private Image img = null;
    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Anim().createAndShowGui();
            }
        });
    }

    public void createAndShowGui() {
        frame = new JFrame("Image Sequence");
        timer = new Timer(1000/30, listener);
        pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    img = ImageIO.read(new FileInputStream(String.format("C:\\Users\\littl\\IdeaProjects\\Task 1\\src\\ru\\mirea\\task8\\taskStep3\\2\\%04d.png", nextImage)));
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                g.drawImage(img , 0, 0, 750, 1000, this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(750, 1000);
            }
        };

        timer.start();

        frame.getContentPane().add(pane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {
            //System.out.println(nextImage);
            nextImage = nextImage < 330-1 ? nextImage + 1 : 0;
            //System.out.println(nextImage);
            pane.repaint();
        }
    };
}
