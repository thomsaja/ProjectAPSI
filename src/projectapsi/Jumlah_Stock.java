/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thomas
 */
public class Jumlah_Stock extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;

    protected void aktif() {
        txtIDMENU.setEnabled(true);
        txtNOMINAL.setEnabled(true);
        txtHARGA.setEnabled(true);
        txtIDMENU.requestFocus();
    }

    protected void kosong() {
        txtIDMENU.setText("");
        txtNOMINAL.setText("");
        txtHARGA.setText("");
    }

    protected void datatable() {
        Object[] Baris = {"Id Menu", "Nominal", "Harga Pulsa"};
        tabmode = new DefaultTableModel(null, Baris);
        tablemenu.setModel(tabmode);
        String sql = "select * from Pulsa order by harga desc";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String Id_Menu = hasil.getString("Id_Menu");
                String Nominal = hasil.getString("Nominal");
                String Harga = hasil.getString("Harga");

                String[] data = {Id_Menu, Nominal, Harga};
                tabmode.addRow(data);
            }
        } catch (Exception e) {

        }
    }

    public Jumlah_Stock() {
        initComponents();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablemenu = new javax.swing.JTable();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        txtIDMENU = new javax.swing.JTextField();
        txtNOMINAL = new javax.swing.JTextField();
        txtHARGA = new javax.swing.JTextField();
        IDMENU = new javax.swing.JLabel();
        NOMINAL = new javax.swing.JLabel();
        HARGA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setFont(new java.awt.Font("Script MT Bold", 2, 20)); // NOI18N
        menu.setText("Daftar Menu");

        tablemenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID MENU", "NOMINAL", "HARGA"
            }
        ));
        tablemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablemenu);

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        IDMENU.setText("Id Menu");

        NOMINAL.setText("Nominal");

        HARGA.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDMENU)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HARGA)
                        .addComponent(NOMINAL)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNOMINAL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHARGA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDMENU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(menu)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDMENU)
                    .addComponent(insert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOMINAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NOMINAL)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHARGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HARGA)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(next))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        JOptionPane.showMessageDialog(null, "Saved", "Next Page", JOptionPane.INFORMATION_MESSAGE);
        Transaksi w = new Transaksi();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        JOptionPane.showMessageDialog(null, "Saved", "Back", JOptionPane.INFORMATION_MESSAGE);
        Login w = new Login();
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        String sql = "insert into Pulsa (Id_Menu, Nominal, Harga) values (?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtIDMENU.getText());
            stat.setString(2, txtNOMINAL.getText());
            stat.setString(3, txtHARGA.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved", "Insert", JOptionPane.INFORMATION_MESSAGE);
            kosong();
            txtIDMENU.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't Saved" + e, "Insert", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String sql = "update Pulsa set Nominal=?, Harga=? where Id_Menu='" + txtIDMENU.getText() + "'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtNOMINAL.getText());
            stat.setString(2, txtHARGA.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved", "Update", JOptionPane.INFORMATION_MESSAGE);
            kosong();
            txtIDMENU.requestFocus();
            datatable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't Save" + e, "Update", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from Pulsa where Id_Menu = '" + txtIDMENU.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Succes");
                kosong();
                txtIDMENU.requestFocus();
                datatable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error" + e);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tablemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemenuMouseClicked
        int bar = tablemenu.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();

        txtIDMENU.setText(a);
        txtNOMINAL.setText(b);
        txtHARGA.setText(c);
    }//GEN-LAST:event_tablemenuMouseClicked

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
            java.util.logging.Logger.getLogger(Jumlah_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jumlah_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jumlah_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jumlah_Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jumlah_Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HARGA;
    private javax.swing.JLabel IDMENU;
    private javax.swing.JLabel NOMINAL;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton insert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menu;
    private javax.swing.JButton next;
    private javax.swing.JTable tablemenu;
    private javax.swing.JTextField txtHARGA;
    private javax.swing.JTextField txtIDMENU;
    private javax.swing.JTextField txtNOMINAL;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}