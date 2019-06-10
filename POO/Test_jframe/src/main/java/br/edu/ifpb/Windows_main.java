package br.edu.ifpb;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class Windows_main extends JFrame{
    public void exe(boolean can){
        if(can){
            setVisible(true);
            WindowListener wd = new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }

                @Override
                public void windowClosed(WindowEvent e) {

                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            };
        }
    }

    @Override
    public void setIconImage(Image image) {
        File arq = new File("C:\\Users\\Gledson\\Desktop\\Jframe//icon.jpg");
        try {
            image = ImageIO.read(arq);
        } catch (IOException e) {
            System.out.println("erro leitura icone");
        }
    }

    @Override
    public void setContentPane(Container contentPane) {
        contentPane.setBackground(Color.BLUE);
    }

    @Override
    public void setSize(Dimension d) {
        d.setSize(640, 400);
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(700, 450);
    }

}
