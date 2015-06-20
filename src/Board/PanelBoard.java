/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

import javax.swing.JPanel;

/**
 *
 * @author Oliver
 */
public final class PanelBoard extends JPanel{
   private int width;
   private int height;
   private int rows;
   private int cols;
   
    /**
     * @return the width
     */
   @Override
    public int getWidth() {
        int width;
        Cell newCell = new Cell();
        width = newCell.getWidth() * getCols();
        
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
   @Override
    public int getHeight() {
        int height;
        Cell newCell = new Cell();
        height = newCell.getHeight() * this.getRows();
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the cols
     */
    public int getCols() {
        return cols;
    }

    /**
     * @param cols the cols to set
     */
    public void setCols(int cols) {
        this.cols = cols;
    }
   
   public PanelBoard(){
   }
   
   public PanelBoard(int rows, int cols){
       this.rows = rows;
       this.cols = cols;
       
       this.setLayout(null);
       this.setVisible(true);
       this.setSize(this.getWidth(),this.getHeight());
       this.setOpaque(false);
       
       
       for (int col = 0; col <= this.getWidth(); col+= new Cell().getWidth()) {
           for (int row = 0; row <= this.getHeight(); row += new Cell().getHeight()) {
               this.add(new Cell(col, row));
               //System.out.println("Col: " + col + "Row: " + row);
           }
       }
   }

}
