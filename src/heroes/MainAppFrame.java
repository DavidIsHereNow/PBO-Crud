/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package heroes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.TableModelListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class MainAppFrame extends javax.swing.JFrame {
        private DefaultTableModel model;

    /**
     * Creates new form MainAppFrame
     */
    public MainAppFrame() {
        initComponents();
   
    String[] judul = {"hero_id", "hero_rank", "hero_name"};
    model = new DefaultTableModel(judul, 0);
    HeroTable.setModel(model);
    
    tampilkan();

       
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
        hero_name_label = new javax.swing.JLabel();
        Btn_Tambah = new javax.swing.JButton();
        Btn_Edit = new javax.swing.JButton();
        hero_id_tf = new javax.swing.JTextField();
        Btn_Hapus = new javax.swing.JButton();
        hero_id_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hero_rank_label = new javax.swing.JLabel();
        hero_rank_tf = new javax.swing.JTextField();
        hero_name_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        HeroTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hero_name_label.setText("hero_name");

        Btn_Tambah.setText("Tambah");
        Btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TambahActionPerformed(evt);
            }
        });

        Btn_Edit.setText("Edit");
        Btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditActionPerformed(evt);
            }
        });

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });

        hero_id_label.setText("hero_id");

        jLabel4.setText("Hero ");

        hero_rank_label.setText("hero_rank");

        HeroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        HeroTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeroTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HeroTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hero_name_label)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hero_id_label)
                                .addComponent(hero_rank_label)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(hero_id_tf)
                            .addComponent(hero_rank_tf)
                            .addComponent(hero_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Tambah)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Edit)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Hapus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hero_id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hero_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hero_rank_label)
                    .addComponent(hero_rank_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hero_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hero_name_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Tambah)
                    .addComponent(Btn_Edit)
                    .addComponent(Btn_Hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TambahActionPerformed
               
        String heroId = hero_id_tf.getText();
    String heroName = hero_name_tf.getText();
    int heroRank = Integer.parseInt(hero_rank_tf.getText());

    // Create a new instance of HeroModel
    HeroModel hero = new HeroModel(heroId, heroRank, heroName);

    // Call the create method to add the hero to the database
    hero.create();

    // Display a success message
    JOptionPane.showMessageDialog(this, "Data hero berhasil ditambahkan");
    tampilkan();
    }//GEN-LAST:event_Btn_TambahActionPerformed

    private void Btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditActionPerformed
     String heroId = hero_id_tf.getText();
    String heroRank = hero_rank_tf.getText();
    String heroName = hero_name_tf.getText();

    // Validate the input values
    if (heroId.isEmpty() || heroRank.isEmpty() || heroName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Harap lengkapi semua data");
        return;
    }

    // Create a new instance of HeroModel with the updated values
    HeroModel hero = new HeroModel(heroId, Integer.parseInt(heroRank), heroName);

    // Call the update method to save the changes to the database
    hero.update();

    // Display a success message
    JOptionPane.showMessageDialog(this, "Data hero berhasil diperbarui");

    // Enable the "Tambah" button and disable the "Update" and "Hapus" buttons
    Btn_Tambah.setEnabled(true);
    Btn_Edit.setEnabled(false);
    Btn_Hapus.setEnabled(false);

    // Clear the text fields
    hero_id_tf.setText("");
    hero_rank_tf.setText("");
    hero_name_tf.setText("");

    // Refresh the table
    tampilkan();
    }//GEN-LAST:event_Btn_EditActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
       
       int selectedRow = HeroTable.getSelectedRow();
    if (selectedRow != -1) {
     String heroId = HeroTable.getValueAt(selectedRow, 0) != null ? HeroTable.getValueAt(selectedRow, 0).toString() : "";

        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            HeroModel heroModel = new HeroModel();
            heroModel.setHeroId(heroId);
            heroModel.delete();

            tampilkan();

            JOptionPane.showMessageDialog(this, "Data hero berhasil dihapus");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void HeroTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeroTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = HeroTable.getSelectedRow();

    if (selectedRow != -1) {
        String heroId = HeroTable.getValueAt(selectedRow, 0) != null ? HeroTable.getValueAt(selectedRow, 0).toString() : "";
        String heroRank = HeroTable.getValueAt(selectedRow, 1) != null ? HeroTable.getValueAt(selectedRow, 1).toString() : "";
        String heroName = HeroTable.getValueAt(selectedRow, 2) != null ? HeroTable.getValueAt(selectedRow, 2).toString() : "";

        // Set the values to the corresponding text fields
        hero_id_tf.setText(heroId);
        hero_rank_tf.setText(heroRank);
        hero_name_tf.setText(heroName);

        // Disable the "Tambah" button and enable the "Update" and "Hapus" buttons
        Btn_Tambah.setEnabled(false);
        Btn_Edit.setEnabled(true);
        Btn_Hapus.setEnabled(true);
    }
    }//GEN-LAST:event_HeroTableMouseClicked
  private void tampilkan() {
    int row = model.getRowCount();
    for (int a = 0; a < row; a++) {
        model.removeRow(0);
    }
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/one","root","");
        ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM hero");
        while (rs.next()) {
            String data [] = {rs.getString(1), rs.getString(2), rs.getString(3)};
            model.addRow(data);
        }
    } catch (SQLException ex) {
        Logger.getLogger(MainAppFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
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
            java.util.logging.Logger.getLogger(MainAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Edit;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Tambah;
    private javax.swing.JTable HeroTable;
    private javax.swing.JLabel hero_id_label;
    private javax.swing.JTextField hero_id_tf;
    private javax.swing.JLabel hero_name_label;
    private javax.swing.JTextField hero_name_tf;
    private javax.swing.JLabel hero_rank_label;
    private javax.swing.JTextField hero_rank_tf;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
