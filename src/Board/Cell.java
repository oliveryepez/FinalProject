/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author Oliver
 */
public final class Cell extends JLabel{
    private int width = 40;
    private int height = 40;
    private int x;
    private int y;
   
    /**
     * @return the x
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    public Cell(){
    }
    
    
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        
        Dimension canvasSize = new Dimension(getWidth(), getHeight());

        this.setSize(canvasSize);
        this.setVisible(true);
        this.setLayout(null);
        this.setOpaque(false);

        this.setLocation(getX(), getY());
        //this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        //System.out.println( "x: " + getX() + " y: " + getY());
    }
 
}
