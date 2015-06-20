/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

/**
 *
 * @author Oliver
 */
public class BackImage extends JComponent {
    Image img;
    
    public BackImage(Image img){
        this.img = img;
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    }
}
