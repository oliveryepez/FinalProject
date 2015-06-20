/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import Board.*;
import Ants.*;


/**
 *
 * @author Oliver
 */
public class BoardConfig extends javax.swing.JFrame {

    /**
     * Creates new form BoardConfig
     */
    
    public PanelBoard mainBoard;
    
    public BoardConfig() {
        initComponents();
        this.getContentPane().setBackground(java.awt.Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRows = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColumns = new javax.swing.JTextField();
        btnAddAnt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Configuration");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("boardConfig"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Board Configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setText("Rows");

        txtRows.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtRows.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRows.setText("0");
        txtRows.setToolTipText("");
        txtRows.setName("txtRows"); // NOI18N
        txtRows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRowsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel2.setText("Columns");

        txtColumns.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtColumns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColumns.setText("0");
        txtColumns.setToolTipText("");
        txtColumns.setName("txtColumns"); // NOI18N
        txtColumns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnsActionPerformed(evt);
            }
        });

        btnAddAnt.setText("Add Ant");
        btnAddAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddAnt)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRows, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRows, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColumns, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(124, 124, 124)
                .addComponent(btnAddAnt)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        txtRows.getAccessibleContext().setAccessibleName("txtQtyRows");
        txtColumns.getAccessibleContext().setAccessibleName("txtQtyColumns");

        jButton1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jButton1.setText("Begin!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleName("btnBegin");

        getAccessibleContext().setAccessibleName("boardConfig");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColumnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnsActionPerformed

    private void txtRowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRowsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRowsActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        int rowsNum = Integer.parseInt(txtRows.getText());
        int colNum = Integer.parseInt(txtColumns.getText());
        
        mainBoard = new PanelBoard(rowsNum, colNum);
        
        /*for (int i = 0; i < 10; i++) {
            Ant dummyAnt = new Ant(i, "Weak", mainBoard.getWidth(), mainBoard.getHeight());
            Thread antThread = new Thread(dummyAnt);
            mainBoard.add(dummyAnt);
            antThread.start();
        }*/
        
        Frame mainFrame = new Frame(mainBoard.getWidth(), mainBoard.getHeight());
        mainFrame.getContentPane().add(mainBoard);
       
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnAddAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAntActionPerformed
        Ant newAnt = new Ant(1, "newAnt", mainBoard.getWidth(), mainBoard.getHeight());
        Thread antThread = new Thread(newAnt);
        mainBoard.add(newAnt);
        mainBoard.repaint();
        antThread.start();
    }//GEN-LAST:event_btnAddAntActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BoardConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoardConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAnt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtColumns;
    private javax.swing.JTextField txtRows;
    // End of variables declaration//GEN-END:variables
}
