/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import javax.swing.*;


/**
 *
 * @author Pablo
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("CreativeSquares");
        setSize(new Dimension(1280, 760));
        // 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_load = new javax.swing.JButton();
        pn_origin = new javax.swing.JPanel();
        pn_final = new javax.swing.JScrollPane();
        btn_savePicture = new javax.swing.JButton();
        lbl_title = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        lbl_sourceTitle = new javax.swing.JLabel();
        lbl_mosaicTitle = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();
        mnb_mainMenu = new javax.swing.JMenuBar();
        mnu_file = new javax.swing.JMenu();
        mnu_newProyect = new javax.swing.JMenuItem();
        mnu_separator1 = new javax.swing.JPopupMenu.Separator();
        mnu_saveProyect = new javax.swing.JMenuItem();
        mnu_separator2 = new javax.swing.JPopupMenu.Separator();
        mnu_loadProyect = new javax.swing.JMenuItem();
        mnu_separator3 = new javax.swing.JPopupMenu.Separator();
        mnu_exit = new javax.swing.JMenuItem();
        mnu_about = new javax.swing.JMenu();
        mnu_instructions = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(1, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 740));

        btn_load.setBackground(new java.awt.Color(255, 255, 255));
        btn_load.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        btn_load.setText("Load picture");
        btn_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadActionPerformed(evt);
            }
        });

        pn_origin.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pn_originLayout = new javax.swing.GroupLayout(pn_origin);
        pn_origin.setLayout(pn_originLayout);
        pn_originLayout.setHorizontalGroup(
            pn_originLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pn_originLayout.setVerticalGroup(
            pn_originLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pn_final.setBackground(new java.awt.Color(204, 204, 204));
        pn_final.setForeground(new java.awt.Color(102, 102, 102));

        btn_savePicture.setBackground(new java.awt.Color(255, 255, 255));
        btn_savePicture.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        btn_savePicture.setText("Save picture");

        lbl_title.setFont(new java.awt.Font("Amatic SC", 1, 36)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("CreativeSquares");

        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_sourceTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        lbl_sourceTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sourceTitle.setText("Source");

        lbl_mosaicTitle.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        lbl_mosaicTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mosaicTitle.setText("Mosaic");

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N

        mnu_file.setText("File");

        mnu_newProyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.png"))); // NOI18N
        mnu_newProyect.setText("New Proyect");
        mnu_newProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_newProyectActionPerformed(evt);
            }
        });
        mnu_file.add(mnu_newProyect);
        mnu_file.add(mnu_separator1);

        mnu_saveProyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        mnu_saveProyect.setText("Save Proyect");
        mnu_file.add(mnu_saveProyect);
        mnu_file.add(mnu_separator2);

        mnu_loadProyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load.png"))); // NOI18N
        mnu_loadProyect.setText("Load Proyect");
        mnu_file.add(mnu_loadProyect);
        mnu_file.add(mnu_separator3);

        mnu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        mnu_exit.setText("Exit");
        mnu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_exitActionPerformed(evt);
            }
        });
        mnu_file.add(mnu_exit);

        mnb_mainMenu.add(mnu_file);

        mnu_about.setText("About");

        mnu_instructions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help.png"))); // NOI18N
        mnu_instructions.setText("How to use...");
        mnu_about.add(mnu_instructions);

        mnb_mainMenu.add(mnu_about);

        setJMenuBar(mnb_mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(lbl_sourceTitle)
                .addGap(609, 609, 609)
                .addComponent(lbl_mosaicTitle))
            .addGroup(layout.createSequentialGroup()
                .addGap(650, 650, 650)
                .addComponent(btn_savePicture))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pn_origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(pn_final, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_load))
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_background, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sourceTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbl_mosaicTitle)))
                .addGap(7, 7, 7)
                .addComponent(btn_savePicture)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_final, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_load))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lbl_background, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loadActionPerformed

    private void mnu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnu_exitActionPerformed

    private void mnu_newProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_newProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnu_newProyectActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_load;
    private javax.swing.JButton btn_savePicture;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_mosaicTitle;
    private javax.swing.JLabel lbl_sourceTitle;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JMenuBar mnb_mainMenu;
    private javax.swing.JMenu mnu_about;
    private javax.swing.JMenuItem mnu_exit;
    private javax.swing.JMenu mnu_file;
    private javax.swing.JMenuItem mnu_instructions;
    private javax.swing.JMenuItem mnu_loadProyect;
    private javax.swing.JMenuItem mnu_newProyect;
    private javax.swing.JMenuItem mnu_saveProyect;
    private javax.swing.JPopupMenu.Separator mnu_separator1;
    private javax.swing.JPopupMenu.Separator mnu_separator2;
    private javax.swing.JPopupMenu.Separator mnu_separator3;
    private javax.swing.JScrollPane pn_final;
    private javax.swing.JPanel pn_origin;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
