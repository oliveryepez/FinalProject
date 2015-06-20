/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ants;

import javax.swing.JLabel;
import Nest.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Oliver
 */
public final class Ant extends JLabel implements Runnable {

    private int id;
    private String imageFile;
    private String type;
    private int coord_x;
    private int coord_y;
    private int step;
    private int counterSteps = 6;
    private char direction;
    private int boardWidth;
    private int boardHeight;
    private Random randomValue = new Random();
    Nest antNest;

    public Ant() {
    }

    public Ant(int id, String type, int boardWidth, int boardHeight) {
        String image;
        String directionString = "LRUD";
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.coord_x = (int) (Math.random()*boardWidth);
        this.coord_y = (int) (Math.random()*boardHeight);

        for (int i = 0; i <= directionString.length(); i++) {
            char direction = directionString.charAt(randomValue.nextInt(directionString.length()));
            System.out.println("Direction = " + directionString.charAt(randomValue.nextInt(directionString.length())));
            this.direction = direction;
        }

        this.id = id;
        this.type = type;

        switch (this.direction) {
            case 'L':
                image = "/assets/ant-left.png";
                int scaleWidth = 50;
                int scaleHeight = 28;
                this.setImageFile(image, scaleWidth, scaleHeight);
                break;

            case 'R':
                image = "/assets/ant-right.png";
                scaleWidth = 50;
                scaleHeight = 28;
                this.setImageFile(image, scaleWidth, scaleHeight);
                break;

            case 'U':
                image = "/assets/ant-up.png";
                scaleWidth = 28;
                scaleHeight = 50;
                this.setImageFile(image, scaleWidth, scaleHeight);
                break;

            case 'D':
                image = "/assets/ant-down.png";
                scaleWidth = 28;
                scaleHeight = 50;
                this.setImageFile(image, scaleWidth, scaleHeight);
                break;
        }
        setLocation(this.coord_x, this.coord_y);
        //System.out.println("x = " + getX() + " y = " + getY());
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public int getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(int boardWidth){ 
        int rand_x = (int)(Math.random()*600);
        this.coord_x = rand_x;
    }

    public int getCoord_y() {
        return coord_y;
    }

    public void setCoord_y() {
        int rand_y = (int)(Math.random()*600);
        this.coord_y = rand_y;
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    public void setImageFile(String file, int scaleWidth, int scaleHeight) {
        try {
            ImageIcon antIcon = new ImageIcon(ImageIO.read(new File(getClass().getResource(file).toURI())));
            Image antImage = antIcon.getImage();
            Image newAnt = antImage.getScaledInstance(scaleWidth, scaleHeight, java.awt.Image.SCALE_SMOOTH);
            antIcon = new ImageIcon(newAnt);
            this.setIcon(antIcon);
            this.setSize(scaleWidth, scaleHeight);
        } catch (URISyntaxException | IOException ex) {

        }
    }

    @Override
    public void run() {
        try {
            switch (this.direction) {
                case 'L':
                    this.moveLeft();
                    break;

                case 'R':
                    this.moveRight();
                    break;

                case 'U':
                    this.moveUp();
                    break;

                case 'D':
                    this.moveDown();
                    break;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Ant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("coord x" + this.getCoord_x());
        System.out.println("coord y" + this.getCoord_y());
    }

    private void moveRight() throws InterruptedException {
        int coord_x = getCoord_x();
        int coord_y = getCoord_y();

        while (true) {
            Thread.sleep(300);
            this.step++;
            coord_x += 20;
            this.rest(this.step);
            this.setBounds(coord_x, coord_y, 70, 50);
        }
    }

    private void moveLeft() throws InterruptedException {
        int coord_x = getCoord_x();
        int coord_y = getCoord_y();

        while (true) {
            Thread.sleep(300);
            this.step++;
            coord_x -= 20;
            this.rest(this.step);
            this.setBounds(coord_x, coord_y, 70, 50);
        }
    }

    private void moveUp() throws InterruptedException {
        int coord_x = getCoord_x();
        int coord_y = getCoord_y();

        while (true) {
            Thread.sleep(300);
            this.step++;
            coord_y -= 20;
            this.rest(this.step);
            this.setBounds(coord_x, coord_y, 50, 70);
        }
    }

    private void moveDown() throws InterruptedException {
        int coord_x = getCoord_x();
        int coord_y = getCoord_y();
        while (true) {
            Thread.sleep(300);
            this.step++;
            coord_y += 20;
            this.rest(this.step);
            this.setBounds(coord_x, coord_y, 50, 70);
        }
    }

    private void rest(int steps) throws InterruptedException {
        System.out.println("Steps = " + steps + " = " + (this.counterSteps));

        if (steps == this.counterSteps) {
            Thread.sleep(10000);
            System.out.println("rest");
            this.counterSteps += 6;
            System.out.println("Counter = " + this.counterSteps);
        }
    }

}
