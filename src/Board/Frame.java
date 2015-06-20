/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Oliver
 */
public class Frame extends JFrame {

    private int width;
    private int height;
    private final String backgroundFile = "/assets/background.jpg";

    public Frame(int width, int height) {
        this.width = width;
        this.height = height;

        try {
            BufferedImage background = ImageIO.read(new File(getClass().getResource(backgroundFile).toURI()));
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setContentPane(new BackImage(background));
            this.setLayout(null);
            this.setSize(width, height);
            this.setVisible(true);

        } catch (URISyntaxException | IOException ex) {
            System.out.println("Error: " + ex);
        }
    }

}
